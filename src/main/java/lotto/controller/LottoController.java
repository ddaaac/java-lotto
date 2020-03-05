package lotto.controller;

import lotto.domain.money.Money;
import lotto.domain.money.TicketCount;
import lotto.domain.number.LottoNumber;
import lotto.domain.number.SerialLottoNumber;
import lotto.domain.result.LottoResult;
import lotto.domain.result.Winning;
import lotto.domain.ticket.AutoLottoTicketsGenerator;
import lotto.domain.ticket.LottoTickets;
import lotto.domain.ticket.ManualLottoTicketsGenerator;
import lotto.view.InputView;
import lotto.view.OutputView;

public class LottoController {
	public static void run() {
		try {
			Money purchaseMoney = Money.of(InputView.inputPurchaseMoney());
			TicketCount ticketCount =
					TicketCount.of(purchaseMoney.totalTicketCount(), InputView.inputManualTicketCount());

			LottoTickets lottoTickets = createLottoTickets(ticketCount);

			Winning winning = createWinning();

			LottoResult lottoResult = LottoResult.of(winning, lottoTickets);
			OutputView.printLottoResult(lottoResult);
			OutputView.printProfitRate(lottoResult.calculateProfitRate(purchaseMoney));
		} catch (IllegalArgumentException e) {
			OutputView.printExceptionMessage(e.getMessage());
		}
	}

	private static LottoTickets createLottoTickets(TicketCount ticketCount) {
		ManualLottoTicketsGenerator manualLottoTicketsGenerator
				= ManualLottoTicketsGenerator.of(InputView.inputManualLottoTicket(ticketCount.getManualTicketCount()));

		AutoLottoTicketsGenerator autoLottoTicketsGenerator
				= AutoLottoTicketsGenerator.of(ticketCount.getAutoTicketCount());

		LottoTickets lottoTickets = LottoTickets.of(manualLottoTicketsGenerator, autoLottoTicketsGenerator);

		OutputView.printLottoTicketsCount(ticketCount.getManualTicketCount(), ticketCount.getAutoTicketCount());
		OutputView.printLottoTickets(lottoTickets);

		return lottoTickets;
	}

	private static Winning createWinning() {
		SerialLottoNumber winningNumbers = SerialLottoNumber.of(InputView.inputWinningNumbers());
		LottoNumber bonusNumber = LottoNumber.of(InputView.inputBonusNumber());

		return Winning.of(winningNumbers, bonusNumber);
	}
}

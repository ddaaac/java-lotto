package lotto.domain.ticket;

import lotto.domain.number.LottoNumber;
import lotto.domain.number.SerialLottoNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

abstract class RandomTicketsGenerator implements TicketsGenerator {
	private static final int ZERO = 0;
	private static final int SIX = 6;

	private final int autoTicketsCount;
	private final List<LottoNumber> allLottoNumbers;

	public RandomTicketsGenerator(final int autoTicketsCount) {
		this.autoTicketsCount = autoTicketsCount;
		this.allLottoNumbers = new ArrayList<>(LottoNumber.allLottoNumbers());
	}

	@Override
	public List<SerialLottoNumber> create() {
		List<SerialLottoNumber> lottoTickets = new ArrayList<>();

		for (int i = 0; i < autoTicketsCount; i++) {
			lottoTickets.add(createRandomLottoTicket());
		}

		return lottoTickets;
	}

	private SerialLottoNumber createRandomLottoTicket() {
		shuffle(allLottoNumbers);
		Set<LottoNumber> lottoNumbers = allLottoNumbers.subList(ZERO, SIX)
				.stream()
				.collect(Collectors.toUnmodifiableSet());

		return SerialLottoNumber.of(lottoNumbers);
	}

	abstract void shuffle(final List<LottoNumber> allLottoNumbers);
}

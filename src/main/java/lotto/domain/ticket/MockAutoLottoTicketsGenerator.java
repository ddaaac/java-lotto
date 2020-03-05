package lotto.domain.ticket;

import lotto.domain.number.LottoNumber;
import lotto.domain.number.SerialLottoNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class MockAutoLottoTicketsGenerator implements TicketsGenerator {
	private static final int ZERO = 0;
	private static final int SIX = 6;

	private final int autoTicketsCount;
	private final List<LottoNumber> allLottoNumbers;

	public MockAutoLottoTicketsGenerator(int autoTicketsCount) {
		this.autoTicketsCount = autoTicketsCount;
		this.allLottoNumbers = new ArrayList<>(LottoNumber.allLottoNumbers());
	}

	public static MockAutoLottoTicketsGenerator of(int autoTicketsCount) {
		return new MockAutoLottoTicketsGenerator(autoTicketsCount);
	}

	@Override
	public List<SerialLottoNumber> create() {
		List<SerialLottoNumber> lottoTickets = new ArrayList<>();

		for (int i = 0; i < autoTicketsCount; i++) {
			lottoTickets.add(createMockRandomLottoTicket());
		}

		return lottoTickets;
	}

	private SerialLottoNumber createMockRandomLottoTicket() {
		Set<LottoNumber> lottoNumbers = allLottoNumbers.subList(ZERO, SIX)
				.stream()
				.collect(Collectors.toUnmodifiableSet());

		return SerialLottoNumber.of(lottoNumbers);
	}
}

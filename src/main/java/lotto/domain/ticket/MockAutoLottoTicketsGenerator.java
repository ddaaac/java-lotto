package lotto.domain.ticket;

import lotto.domain.number.LottoNumber;

import java.util.List;

public class MockAutoLottoTicketsGenerator extends RandomTicketsGenerator {
	public MockAutoLottoTicketsGenerator(int autoTicketsCount) {
		super(autoTicketsCount);
	}

	public static MockAutoLottoTicketsGenerator of(int autoTicketsCount) {
		return new MockAutoLottoTicketsGenerator(autoTicketsCount);
	}

	@Override
	void shuffle(final List<LottoNumber> allLottoNumbers) {
	}
}

package lotto.domain.ticket;

import lotto.domain.number.LottoNumber;

import java.util.Collections;
import java.util.List;

public class AutoLottoTicketsGenerator extends RandomTicketsGenerator {
	private AutoLottoTicketsGenerator(final int autoTicketsCount) {
		super(autoTicketsCount);
	}

	public static AutoLottoTicketsGenerator of(final int autoTicketsCount) {
		return new AutoLottoTicketsGenerator(autoTicketsCount);
	}

	@Override
	void shuffle(final List<LottoNumber> allLottoNumbers) {
		Collections.shuffle(allLottoNumbers);
	}
}

package lotto.domain.ticket;

import lotto.domain.number.SerialLottoNumber;

import java.util.List;
import java.util.stream.Collectors;

public class ManualLottoTicketsGenerator implements TicketsGenerator {
	private final List<String> lottoTicketsInput;

	private ManualLottoTicketsGenerator(final List<String> lottoTicketsInput) {
		this.lottoTicketsInput = lottoTicketsInput;
	}

	public static ManualLottoTicketsGenerator of(final List<String> lottoTicketsInput) {
		return new ManualLottoTicketsGenerator(lottoTicketsInput);
	}

	@Override
	public List<SerialLottoNumber> create() {
		return lottoTicketsInput.stream()
				.map(SerialLottoNumber::of)
				.collect(Collectors.toUnmodifiableList());
	}
}

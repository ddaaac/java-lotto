package lotto.domain.ticket;

import lotto.domain.number.SerialLottoNumber;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class ManualLottoTicketsGeneratorTest {
	@Test
	void create() {
		// given
		List<String> lottoTicketsInput = Arrays.asList("1,2,3,4,5,6",
				"3,4,5,6,7,8",
				"43,42,1,3,36,24");
		ManualLottoTicketsGenerator manualLottoTicketsGenerator
				= ManualLottoTicketsGenerator.of(lottoTicketsInput);

		// when
		LottoTickets result = LottoTickets.of(manualLottoTicketsGenerator);

		// then
		List<SerialLottoNumber> expected = lottoTicketsInput.stream()
				.map(SerialLottoNumber::of)
				.collect(Collectors.toList());
		Assertions.assertThat(result).isEqualTo(new LottoTickets(expected));
	}
}
package lotto.model;

import java.util.List;

public class LottoResult {
    private Money money;
    private PrizeInfo prizeInfo;


    public LottoResult(Money money, List<Prize> prizes) {
        prizeInfo = new PrizeInfo(prizes);
        this.money = money;
    }

    public double calculateProfitRate() {
        int sum = 0;
        for (Prize prize : Prize.values()) {
            sum += prize.getPrizeMoney() * prizeInfo.get(prize);
        }
        return money.calculateProfitRate(sum);
    }

    public int getCount(Prize prize) {
        return prizeInfo.get(prize);
    }
}
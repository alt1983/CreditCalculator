public class CreditCalculator {

    Integer getMonthPayment(Integer sum, Integer rate, Integer months) {
        Integer res = 0;
        if(months > 0) {
            res = (sum + sum * rate / 100 / 12 * months) / months;
        }
        return res;
    }

    Integer getFullSumm(Integer sum, Integer rate, Integer months) {
        Integer res = sum + sum*rate/100/12*months;
        return res;
    }

    Integer getOverPayment(Integer sum, Integer rate, Integer months) {
        Integer res = sum*rate/100/12*months;
        return res;
    }

}

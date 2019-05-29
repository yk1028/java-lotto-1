package lotto.domain;

import java.util.*;
import java.util.stream.Collectors;

public class LottoNumbersGenerator {
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int SUBLIST_LOWER_BOUND = 0;
    private static final int SUBLIST_UPPER_BOUND = 6;
    private static final List<LottoNumber> totalLottoNumbers = new ArrayList<>();
    private static final List<LottoNumber> fixedTotalLottoNumbers = new ArrayList<>();

    static {
        for (int i = MIN_LOTTO_NUMBER; i <= MAX_LOTTO_NUMBER; i++) {
            LottoNumber lottoNumber = new LottoNumber(i);
            totalLottoNumbers.add(lottoNumber);
            fixedTotalLottoNumbers.add(lottoNumber);
        }
    }

    public static LottoNumbers getLottoNumbers() {
        Collections.shuffle(totalLottoNumbers, new Random());
        List<LottoNumber> lottoNumbers = new ArrayList<>(
                totalLottoNumbers.subList(SUBLIST_LOWER_BOUND, SUBLIST_UPPER_BOUND));
        return new LottoNumbers(lottoNumbers);
    }

    public static LottoNumbers getLottoNumbers(String numbers) {
        List<LottoNumber> lottoNumbers = new ArrayList<>();
        for (int number : makeNumbers(numbers)) {
            lottoNumbers.add(totalLottoNumbers.get(number - 1));
        }
        return new LottoNumbers(lottoNumbers);
    }

    private static List<Integer> makeNumbers(String numbers) {
        return Arrays.stream(numbers.split(","))
                .map(number -> Integer.parseInt(number.trim()))
                .collect(Collectors.toList());
    }
}

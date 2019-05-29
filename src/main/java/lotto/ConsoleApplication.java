package lotto;

import lotto.domain.*;
import lotto.view.InputView;
import lotto.view.OutputView;

public class ConsoleApplication {
    public static void main(String[] args) {
        Money money = new Money(InputView.inputMoney());
        Lottos lottos = LottoMachine.buyLottos(money);
        OutputView.outputLottos(lottos);

        LottoNumbers winningNumbers = LottoNumbersGenerator.getLottoNumbers(InputView.inputWinningNumbers());
        WinningInformation winningInformation = new WinningInformation(winningNumbers);
        LottoGame lottoGame = new LottoGame(winningInformation);

        LottoResult lottoResult = lottoGame.confirmWinningLottos(lottos);
        OutputView.outputResult(lottoResult);
    }
}

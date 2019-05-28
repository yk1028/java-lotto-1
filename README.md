# java-lotto
### Domain
1. LottoNumber
    - 로또 번호 하나를 저장 (int)
    - 1 ~ 45의 사이의 정수
2. LottoNumbers
    - 1 ~ 45까지의 로또 번호를 미리 저장해 놓고 재사용
    - Shuffle을 활용해서 List의 앞에서부터 6개의 랜덤한 로또 번호를 넘겨준다.
3. Lotto
    - 6개의 로또 번호 저장 (List)
    - 번호 생성 방식 선택 가능(자동 - 생성자 파라미터 없음, 수동 - 생성자 파라미터로 리스트 입력)
    - LottoNumber의 존재 여부를 파악 할 수 있어야한다.
    - 다른 로또와 비교해서 당첨 개수에 맞는 WinningType을 반환
4. Lottos
    - Lotto들의 리스트
5. LottoMachine
    - 금액 입력 시 최대 구매 가능 개수 판단
    - 최대 구매 가능 개수 만큼 Lottos 반환
    - 예외 : 1000원 미만 입력, 최대 구매 가능 금액도 지정
6. WinningLotto
    - Lotto + 보너스 볼
    - Lotto를 상속 받는다.
7. LottoGame
    - Lottos와 WinningLotto 입력시 LottoResult 반환
8. WinningType
    - 당첨 종류를 나타내는 enum
    - 일치 개수를 입력 받으면 해당하는 WinningType을 반환
9. LottoResult
    - 당첨 결과 저장 (Map<WinningType, Integer>)
    - 수익률 계산

### Input
- 구입 금액
- 당첨 번호

### output
- 당첨 통계
- 총 수익률

# java-lotto
로또 미션 진행을 위한 저장소
# 도메인 기능 목록
- [X] 구입금액을 표현하는 기능
    - [X] [예외1] 구입 금액이 0보다 큰지 확인하는 기능
    - [X] [예외2] 구입 금액이 1000의 배수인지 확인하는 기능
    - [X] 수동으로 구입한 로또의 가격만큼 구입금액에서 차감하는 기능
        - [X] [예외1] 구입할 수 있는 개수보다 작거나 같은지 확인하는 기능
        - [X] [예외2] 입력받은 개수가 0보다 같거나 큰지 확인하는 기능
- [X] 로또 번호를 표현하는 기능
    - [X] [예외1] 로또 번호가 1 이상 45 이하인지 확인하는 기능
- [X] 로또 번호 6개로 로또 티켓을 표현하는 기능
    - [X] [예외1] 정확히 6개의 번호로 이루어졌는지 확인하는 기능
    - [X] [예외2] 중복되는 로또 번호가 있는지 확인하는 기능
- [X] 전체 로또 번호를 가져오는 기능
- [ ] 티켓을 수동으로 생성하는 기능
- [X] 티켓을 자동으로 생성하는 기능
- [ ] 수동 및 자동으로 생성된 티켓들을 합치는 기능
- [X] 당첨 번호 6개와 보너스 번호를 생성하는 기능
    - [X] [예외1] 당첨 번호와 보너스가 중복되는지 확인하는 기능
    - [X] [예외2] 입력값이 올바르지 않을 경우 다시 입력받는 기능
- [X] 보너스 번호를 포함하여 당첨 번호와 로또 티켓을 비교하는 기능
- [X] 당첨 등수의 보너스 요구 여부를 표현하는 기능
- [X] 당첨금 정보를 표현하는 기능
- [X] 로또 티켓 구입 리스트를 표현하는 기능
- [X] 로또 결과를 표현하는 기능
- [X] 수익률 계산하는 기능
- [X] 문자열을 입력받아 정수 리스트로 변환하는 기능
    - [X] 입력의 공백을 제거하는 기능
    - [X] 입력을 쉼표로 구분하는 기능
    - [X] 구분된 문자열을 정수로 변환하는 기능
    - [X] [예외1] 입력값이 올바르지 않을 경우 다시 입력받는 기능
# 뷰 기능 목록
- [X] 구입금액을 입력받는 기능
    - [X] [예외1] 입력값이 정수인지 확인하는 기능
- [X] 수동으로 구매할 로또 수를 입력받는 기능
    - [X] [예외1] 입력 값이 올바르지 않을 경우 다시 입력받는 기능
- [ ] 수동으로 구매할 번호를 입력받는 기능
- [X] 몇 개의 로또티켓을 구매했는지 출력하는 기능
    - [ ] 수동 및 자동으로 분리하여 출력하는 기능
- [X] 구입한 티켓의 번호들을 출력하는 기능
- [X] 당첨 및 보너스 번호를 입력하는 기능
- [X] 당첨 통계를 출력하는 기능
- [X] 수익률을 출력하는 기
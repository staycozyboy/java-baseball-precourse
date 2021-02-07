# 미션 - 숫자 야구 게임

## BaseBall 요구사항
TDD.

### 기능
* [ ] [1, 9]의 서로 다른 수로 이루어진 3자리 난수 생성.
 
* [ ] 사용자에게 3자리 숫자 입력 받기.
  * [ ] **Exc1.** 숫자가 아닌 경우
  * [ ] **Exc2.** 요구사항([1, 9], 서로 다른, 3자리)을 만족하지 않는 경우
  
* [ ] 컴퓨터의 난수와 사용자 입력을 비교.
  * [ ] 볼 : 난수의 digit과 입력의 digit이 같지만, index가 다른 경우.
  * [ ] 스트라이크 : 난수의 digit과 입력의 digit이 같고, index까지 같은 경우.
  * [ ] 낫싱 : 같은 digit이 없는 경우.
  * [ ] 게임 종료 : 3 스트라이크인 경우(난수와 입력이 같은 경우).
    * [ ] 게임 종료가 나오기 전까지 반복.
  * [ ] 결과(스트라이크/볼/낫싱) 출력.
  
* [ ] 게임 종료 이후 게임 재시작 의사를 묻기.
  * [ ] 사용자 입력 받기.
  * [ ] 1 : 게임 재시작.
  * [ ] 2 : 프로그램 종료.
  * [ ] **Exc.** 이외의 입력을 받은 경우.
  
[comment]: <> (### 구현)


### 프로그래밍 실행 결과 예시
```
숫자를 입력해주세요 : 123
1볼 1스트라이크
숫자를 입력해주세요 : 145
1볼
숫자를 입력해주세요 : 671
2볼
숫자를 입력해주세요 : 216
1스트라이크
숫자를 입력해주세요 : 713
3스트라이크
3개의 숫자를 모두 맞히셨습니다! 게임 종료
게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.
1
숫자를 입력해주세요 : 123
1볼 1스트라이크
… 
```

<br>

## 프로그래밍 요구사항
- 자바 코드 컨벤션을 지키면서 프로그래밍한다.
  - 기본적으로 [Google Java Style Guide](https://google.github.io/styleguide/javaguide.html)을 원칙으로 한다.
  - 단, 들여쓰기는 '2 spaces'가 아닌 '4 spaces'로 한다.
- indent(인덴트, 들여쓰기) depth를 3이 넘지 않도록 구현한다. 2까지만 허용한다.
  - 예를 들어 while문 안에 if문이 있으면 들여쓰기는 2이다.
  - 힌트: indent(인덴트, 들여쓰기) depth를 줄이는 좋은 방법은 함수(또는 메소드)를 분리하면 된다.
- 3항 연산자를 쓰지 않는다.
- 함수(또는 메소드)가 한 가지 일만 하도록 최대한 작게 만들어라.
- System.exit 메소드를 사용하지 않는다.
- 비정상적 입력에 대해서는 IllegalArgumentException을 발생시킨다.
- 

### 프로그래밍 요구사항 - Application
- Application 클래스를 활용해 구현해야 한다.
- Application의 패키지 구조와 구현은 변경하지 않는다.
- `final Scanner scanner = new Scanner(System.in);`는 변경하지 않는다.
- `// TODO 구현 진행` 이 후 부터 구현한다.
- 모든 함수의 인자 수를 3개까지만 허용한다.
- 모든 함수의 길이를 10라인 이하로 제한한다.
- 모든 원시값과 문자열을 포장한다.
- 콜렉션에 대해 일급 콜렉션을 적용한다.
- 불필요한 `getter` / `setter` 없이 구현한다.
- Junit의 `@DisplayName`을 활용해 테스트 메소드의 의도를 드러낸다.

```java
public class Application {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        // TODO 구현 진행
    }
}
```

### 프로그래밍 요구사항 - RandomUtils
- RandomUtils 클래스를 활용해 랜덤 기능을 구현해야 한다.
- RandomUtils의 패키지 구조와 구현은 변경하지 않는다.

```java
private static final Random RANDOM = new Random();
    private RandomUtils() {
    }
    public static int nextInt(final int startInclusive, final int endInclusive) {
    ...
```

<br>

## 진행 요구사항
- 기능을 구현하기 전에 java-baseball-precourse/README.md 파일에 구현할 기능 목록을 정리해 추가한다.
- git의 commit 단위는 앞 단계에서 README.md 파일에 정리한 기능 목록 단위로 추가한다.
  - [AngularJS Commit Message Conventions](https://gist.github.com/stephenparish/9941e89d80e2bc58a153) 참고해 commit log를 남긴다.

<br>

## License

This project is [MIT](https://github.com/woowacourse/java-baseball-precourse/blob/master/LICENSE) licensed.

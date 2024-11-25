# bob-custom-serialization
커스텀 직렬화 환경 구축을 위해 위 깃허브 레포지토리를 클론하고, Intelij를 이용하여 프로젝트를 Open 후, Main.java를 실행시키면 된다.
추가적으로 Server와 GitHub 코드 간 패키지명을 일치시키는 작업을 진행하였다. 패키지명이 다르면 직렬화된 객체를 역직렬화할 때 ClassNotFoundException이 발생할 수 있기 때문에, 동일한 패키지 구조를 유지하는 것이 중요하다.

또한, 직렬화된 객체가 서로 다른 환경에서 동일하게 인식되도록 serialVersionUID를 명시적으로 설정하였다. serialVersionUID는 직렬화된 객체의 버전을 식별하는 데 사용되며, 서버와 클라이언트 간 버전 불일치로 인해 InvalidClassException이 발생하는 문제를 방지할 수 있다.

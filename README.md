# 커스텀 직렬화 환경 구축 가이드
1. GitHub 레포지토리 클론 및 실행
  - bob-custom-serialization 레포지토리를 클론합니다.
  - Intelij IDEA를 이용해 프로젝트를 열고, Main.java를 실행하여 환경을 확인합니다.
    
2. 패키지명 일치 작업
- 서버와 GitHub 코드의 패키지명을 동일하게 설정해야 합니다.
- 패키지명이 다르면 직렬화된 객체를 역직렬화할 때 **ClassNotFoundException**이 발생할 수 있습니다.
동일한 패키지 구조를 유지함으로써, 서버와 클라이언트 간 직렬화/역직렬화가 정상적으로 이루어지도록 설정합니다.

3. serialVersionUID 설정
- 직렬화된 객체가 서로 다른 환경에서 동일하게 인식되도록 **serialVersionUID**를 명시적으로 설정합니다.
- **serialVersionUID**는 직렬화된 객체의 버전을 식별하며, 서버와 클라이언트 간 버전 불일치로 인해 발생할 수 있는 **InvalidClassException**을 방지합니다.

4. serialVersionUID 일치 확인
- 직렬화 데이터를 전송하고, Logcat에서 serialVersionUID 값을 확인합니다.
- 원본의 serialVersionUID와 내가 설정한 serialVersionUID가 다르다면, 동일한 값으로 수정합니다.
이 작업을 통해 객체가 올바르게 역직렬화될 수 있도록 보장합니다.

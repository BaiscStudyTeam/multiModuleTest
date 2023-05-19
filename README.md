본 설명서는 Gradle 멀티 모듈 구현 예제 프로젝트입니다. 

1. settings.gradle 확인 

settings.gradle에 최상위 모듈 명 (현재 폴더에서는 multiModuleTestFinished) 을 경로에 맞추어 적어줍니다. 

이후 include 키워드와 함께 하위 경로의 서브모듈 최상위 경로 (build.gradle 포함한 패키지경로) 를 적어줍니다.

이 경우에는 blog-login , blog-board , blog-core가 서브 모듈 경로 및 프로젝트 이름으로 등록됩니다. 

2. 최상위 루트 폴더의 build.gradle 확인 (/multiModuleTestFinished/build.gradle)

최상위 루트 폴더에서는 모든 서브모듈에 공통적으로 적용할 수 있는 플러그인을 명시할 수 있습니다. 

subprojects 키워드로 각 모듈간의 공통적인 설정 ( 저장소 주소, 의존 라이브러리, 설정) 등을 적용할 수 있습니다. 

3. 각 모듈의 build.gradle 확인 

각 모듈의 build.gradle은 항상 모듈의 최상위 경로 하위에 위치해야 합니다 (/blog-core, /bolg-board, /blog-login)

spring-boot 의존성을 추가하면 bootJar 커맨드 실행 시 spring-boot 실행 파일을 찾게 되므로, 실행 파일이 있는 core를 제외한 

나머지 모듈들은 bootJar 커맨드를 끈 후 jar 커맨드를 활성화하여 jar 파일만 빌드하도록 설정합니다. 

4. Spring-boot Applicatoin 실행 후 controller에 요청 보내기 

spring boot Application을 실행합니다. 

blog-core의 메인 메서드에서 실행해도 되고, IDEA에서 gradle 모듈 중 blog-core를 명시하여 main 메서드를 검색, 실행시켜도 됩니다. 

실행 후 localhost:8080 을 입력하면 기본 경로로 요청이 들어가며, CORE 모듈에서 각 모듈의 bean을 Autowired하여 실행시킵니다. 

core에서 이벤트를 받은 각 모듈들은 콘솔에 순차적으로 출력됩니다. 

여기까지가 완료되면 구현 성공입니다!
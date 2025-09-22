# Study-SpringBoot
## 자바와 스프링 부트로 생애 최초 서버 만들기, 누구나 쉽게 개발부터 배포까지! [서버 개발 온인원 패키지] - 최태현

### SpringBoot 공부

### 배포 주소 : http://13.125.57.245:8080/v1/index.html

### Linux 명령어
```
/// 관리자 권한으로 설치되어 있는 프로그램들을 최신화
sudo yum update


// 관리자 권한으로 프로그램 설치
sudo yum install mysql(프로그램 이름)


/// 프로그램의 상태 확인
sudo systemctl status mysqld(프로그램)


// git clone
git clone https://github.com/minnnnnnnnnnn/Study-SpringBoot.git


// graldew 초기 접근 권한 설정 및 build (build 폴더 생성됨)
chmod +x ./gradlew
./gradlew build -x test // test는 생략


// Background 환경에서 서버 실행, profile은 dev로
nohup java -jar library-app/build/libs/library-app-0.0.1-SNAPSHOT.jar --spring.profiles.active=dev &


// 현재 실행중인 프로그램 목록 (java가 포함 된 것만)
ps aux | grep java


// 실행중인 프로그램 종료
kill -9 112536(프로그램 번호)


// 파일 확인
vi nohup.out(파일 이름) // vim을 이용해 직접 실행
tail -f bohup.out // 실시간으로 뒤만 출력
```
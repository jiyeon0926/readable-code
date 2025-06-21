# 🗂️ 내용 정리
## 📝 주차별 학습 및 회고
👉 [인프런 워밍업 클럽 4기 BE 스터디 1주차](https://www.inflearn.com/blogs/10789) <br>
👉 [인프런 워밍업 클럽 4기 BE 스터디 2주차](https://www.inflearn.com/blogs/10966) <br>
👉 [인프런 워밍업 클럽 4기 BE 스터디 3주차](https://www.inflearn.com/blogs/11144) <br>

## 💡 Value Object
Value Object : 도메인의 어떤 개념을 추상화하여 표현한 값 객체
- 불변성 : final 필드로 선언하고, setter 금지
- 동등성 : 서로 다른 인스턴스여도 내부의 값이 같으면 같은 값 객체로 취급
  - equals()와 hashCode()는 기본적으로 참조값을 비교하도록 구현되어 있기 때문에 동등성을 위해 재정의 필요
- 유효성 검증 : 생성자에서 값에 대한 유효성을 보장하기
 
VO vs Entity
- Entity는 식별자가 존재하며, 식별자가 같으면 동등한 객체로 취급
- VO는 식별자 없이, 내부의 모든 값이 같아야 동등한 객체로 취급

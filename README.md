# 목차

1. [팀 소개](#팀-소개)
2. [기술 스택](#기술-스택)
   - [Backend](#1-backend)
   - [Frontend](#2-frontend)
   - [DataBase](#3-database)
   - [Infra](#4-infra)
   - [ETC](#5-etc)
3. [프로젝트 개요](#프로젝트-개요)
   - [주제](#1-주제)
   - [배경](#2-배경)
   - [서비스 목표](#3-서비스-목표)
   - [차별점](#4-차별점)
   - [핵심 기능](#5-핵심-기능)
   - [기대 효과](#6-기대-효과)
4. [설계 문서](#설계-문서)
   - [System Architecture](#system-architecture)
   - [DDD](#ddd)
     - [Event Storming](#1-event-storming)
     - [External System](#2-external-system)
     - [Command & Actor](#3-command-and-actor-system)
     - [Aggregate](#4-aggregate)
     - [Bounded Context](#5-bounded-context)
     - [Context Mapping](#6-context_mapping)
5.  [DB 모델링](#db-모델링)
     - [논리 모델링](#2-논리-모델링)
     - [물리 모델링](#3-물리-모델링)
6. [산출물](#산출물)
   - [요구사항 명세서](#요구사항명세서)
   - [기능명세서](#기능명세서)
   - [WBS](#WBS)
   - [화면설계서](#화면설계서)
   - [AS-IS TO-BE](#as-is-to-be)
   - [살행결과](#실행결과)
   - [CI/CD] (#CI/CD)
7.[발표 자료](#etc)

---

## Team _STANL-2_<a id="팀-소개"></a>
![image](https://github.com/user-attachments/assets/e09b9f7a-2cc3-41fa-8164-348a494882c9)
| <img width="130" height="100" alt="스크린샷 2024-09-05 오전 9 50 04" src="https://github.com/user-attachments/assets/5ce7dd8a-205b-49f9-9274-aeef0ebe11fb">| <img width="130" height="100" alt="스크린샷 2024-09-05 오전 9 47 10" src="https://github.com/3-Minutes-Query/choleeTest/assets/102345450/1046b24a-5d40-4dc1-a747-cb65f20dc764"> | <img width="130" height="100" alt="스크린샷 2024-09-05 오전 9 47 28" src="https://github.com/user-attachments/assets/6a0e2b77-22d6-4e45-be58-2336f7e80afe"> | <img width="130" height="100" alt="스크린샷 2024-09-05 오전 9 47 28" src="https://github.com/user-attachments/assets/67e48c8e-6e01-476e-b255-c902a1eba08e"> | <img width="130" height="100" alt="스크린샷 2024-09-05 오전 9 47 28"  src="https://github.com/user-attachments/assets/c485422d-7685-40cb-aed3-a6893c75044e"> |
| ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------ |
| 기우석 | 김민석 | 방동호 | 송의혁 | 유혜진 |
---

# 기술 스택 <a id="기술-스택"></a>

### 1. Backend <a id="1-backend"></a>
<img src="https://skillicons.dev/icons?i=java,spring,hibernate,gradle,postman,idea& perline="/> 

### 2. Frontend <a id="2-frontend"></a>
<img src="https://skillicons.dev/icons?i=html,css,js,vue& perline="/> 

### 3. DataBase <a id="3-database"></a>
<img src="https://skillicons.dev/icons?i=mysql,redis,mongodb& perline="/> 

### 4. Infra <a id="4-infra"></a>
<img src="https://skillicons.dev/icons?i=jenkins,docker,nginx,kubernetes& perline="/> 

### 5. ETC <a id="5-etc"></a>
<img src="https://skillicons.dev/icons?i=aws,npm,notion,discord,github,ai,i& perline="/> 

# 프로젝트 개요 <a id="프로젝트-개요"></a>
## 1. 주제 <a id="1-주제"></a>
<b>한국에 여행오는 외국인들과 국내 여행객들을 위한 물품 공유 서비스</b>

## 2. 배경 <a id="2-배경"></a>
1. 기내 반입 금지 물품들로 인해 버려지는 물품들이 공항에 쌓여가고 있음
2. 여행 중 일회성 소비를 막고, 지속 가능한 사회를 만들어가기 위함

## 3. 서비스 목표 <a id="3-서비스-목표"></a>

> 💡 여행자들의 불필요한 지출 방지 및 버려지는 물품 감소
> 💡 외국인, 국내인 통한된 여행자 커뮤니티
> 💡 여행 물품을 기부를 함으로써 이후 여행오는 여행자가 사용할 수 있게 함

## 4. 차별점 <a id="4-차별점"></a>

|                      | <img width="100" height="70" alt="당근" src="https://github.com/user-attachments/assets/bfaf0c38-8d4d-449d-a9ae-5249fe616f9c"> | <img width="100" height="70" alt="오쉐어" src="https://github.com/user-attachments/assets/53452c89-230a-4b30-9a16-d5f9b7dfce17"> | <img width="100" height="70" alt="WSU" src="https://github.com/user-attachments/assets/bef07352-9ed0-4fd6-861c-0f7df9d1bc76"> |
|----------------------|:------------------------------------:|:------------------------------------:|:------------------------------------:|
| ***다양한 언어 지원***          |               X                                |                X                               |               ㅇ                   |
| ***기부 & 대여 서비스***      |    ㅇ                               |  ㅇ                           | △                                |
| ***여행자 커뮤니티***             | X                                | ㅇ                                |    X                            |


## 5. 핵심 기능 <a id="5-핵심-기능"></a>

1. 공유 물품 대여 기능
2. 여행자 SNS 커뮤니티
3. 사용자 간 채팅 기능
4. 다양한 언어 번역 기능

## 6. 기대 효과 <a id="6-기대-효과"></a>

> 국내/외 여행자 커뮤니티를 활성화하여, 사용자들끼리의 상호작용음

# 설계 문서 <a id="설계-문서"></a>

---

## System Architecture <a id="system-architecture"></a>

![image](https://github.com/user-attachments/assets/844d3f87-8494-40d4-96cf-00ea06a8e8b7)

## DDD <a id="ddd"></a>

### 1. Event Storming <a id="1-event-storming"></a>

![image](https://github.com/user-attachments/assets/2aa841bc-711a-4be8-8723-3e02ffe67bdc)

### 2. External System <a id="2-external-system"></a>

![image](https://github.com/user-attachments/assets/b0f246d8-50f1-4644-9b00-de8ef8b5a00c)

### 3. Command & Actor <a id="3-command-and-actor-system"></a>

![image](https://github.com/user-attachments/assets/edb25e69-3553-405b-a460-dafb7d50d60e)

### 4. Aggregate <a id="4-aggregate"></a>

![image](https://github.com/user-attachments/assets/14a5be54-4f55-4dd7-b4f1-0b7ead806fef)

### 5. Bounded Context <a id="5-bounded-context"></a>

![image](https://github.com/user-attachments/assets/437d1dc4-8091-4f30-9f84-d2b089be34de)

### 6. Context Mapping <a id="6-context_mapping"></a>

![image](https://github.com/user-attachments/assets/d7872d52-41f8-424c-ad04-abd5f5b73695)

## DB 모델링 <a id="db-모델링"></a>

### 1. 논리 모델링 <a id="2-논리-모델링"></a>

![image](https://github.com/user-attachments/assets/2b8d6d61-4d78-4380-b7c0-52db65938084)


### 2. 물리 모델링 <a id="3-물리-모델링"></a>

![image](https://github.com/user-attachments/assets/08499ff0-00ae-4e62-83cc-5376c4ae5ef1)

## 산출물<a id="산출물"></a>

### 1. 요구사항 명세서 <a id="요구사항명세서"></a>

[요구사항 명세서 바로가기](https://docs.google.com/spreadsheets/d/1FtUepEhB9tNA0qP20CNM_EzY0c0Jh0suZ3eh00r_5K0/edit?gid=0#gid=0)

![image](https://github.com/user-attachments/assets/54ab239f-be8b-487a-ad08-4a1a1021c21d)
![image](https://github.com/user-attachments/assets/56ffc490-62e5-4960-9877-60827520e468)

### 2. 기능 정의서 <a id="기능명세서"></a>

[[기능 정의서 바로가기](https://docs.google.com/spreadsheets/d/1FtUepEhB9tNA0qP20CNM_EzY0c0Jh0suZ3eh00r_5K0/edit?gid=1007720080#gid=1007720080)]

![image](https://github.com/user-attachments/assets/fd7dd066-3180-4e56-afac-8d63645fcd91)
![image](https://github.com/user-attachments/assets/28fa0db9-9315-4acc-b767-baed89d83189)

### 3. WBS<a id="WBS"></a>

![image](https://github.com/user-attachments/assets/82cb9fd2-2de6-4757-ad97-a1de9b63a7be)

### 4. 화면 설계서<a id="화면설계서"></a>
![image](https://github.com/user-attachments/assets/b5be8cc1-59d8-43c2-b26d-0af5660c27e4)
![image](https://github.com/user-attachments/assets/60be1083-44a5-4aab-847e-d46527bad78e)
![image](https://github.com/user-attachments/assets/3ee516de-101e-4cb4-a662-b81c6437cf18)

### 5. AS IS TO BE<a id="as-is-to-be"></a>

![image](https://github.com/user-attachments/assets/b63c2582-a926-4080-aeeb-83b61b949e75)



### 6. 실행 결과<a id="실행결과"></a>

<details>
<summary>👨‍👩‍👧‍👦회원</summary>
<details>
<summary>회원가입 & 이메일 인증  </summary>

   
https://github.com/user-attachments/assets/f56d6c30-1e88-4b80-a00a-c45b48a919de


</details>
<details>
<summary>로그인 </summary>

   
https://github.com/user-attachments/assets/b4848f50-fb87-4b7b-820a-872113fe6b4e


</details>
<details>
<summary>프로필 수정 </summary>

   
https://github.com/user-attachments/assets/f0776a3b-9a12-46fc-8384-d4624c903f1c


</details>
</details>

---

<details>
<summary>📋게시글</summary>

<details>
<summary>게시글 조회</summary>


https://github.com/user-attachments/assets/a1db067f-e8c8-4742-ba81-d6af500b384a

   
</details>
<details>
<summary>게시글 작성</summary>


https://github.com/user-attachments/assets/c72a75fc-41ee-4380-a708-eb0b1fbaf579

   
</details>
<details>
<summary>게시글 수정</summary>


https://github.com/user-attachments/assets/ad01e96c-e453-4c51-922b-c3f090bd4bef

   
</details>
<details>
<summary>게시글 삭제</summary>


https://github.com/user-attachments/assets/38522821-f81c-42ba-92bb-ac025ae1a526

   
</details>
<details>
<summary>게시글 댓글</summary>


https://github.com/user-attachments/assets/67ea3a26-0d3b-4a63-8fc3-8bb76824c0a4

   
</details>
<details>
<summary>게시글 댓글 알람</summary>


https://github.com/user-attachments/assets/37668fff-ce2e-44a7-8293-50d6081e6586

   
</details>
</details>

---

<details>
<summary>🧳공유물품</summary>
<details>
<summary>공유물품 조회 & 대여</summary>


https://github.com/user-attachments/assets/78f0ce16-44fc-4da5-9931-9eeda17828e0

   
</details>
</details>

---

<details>
<summary>📢공지사항</summary>
<details>
<summary>공지사항 조회</summary>


https://github.com/user-attachments/assets/142f02dc-59b5-4c4b-b475-1d80cf719826

   
</details>
</details>
   
---

<details>
<summary>🙋🏻FAQ & 번역</summary>
<details>
<summary>FAQ 조회 & 번역 </summary>


https://github.com/user-attachments/assets/beaf8fbe-b669-48e0-bff2-129666cdcda4

   
</details>
</details>

---

<details>
<summary>💌채팅</summary>
<details>
<summary>채팅방 생성 & 채팅</summary>


https://github.com/user-attachments/assets/4a0f8642-282c-407e-88e5-aa801c854f7b

   
</details>
<details>
<summary>게시글에서 채팅보내기</summary>


https://github.com/user-attachments/assets/fd73bce2-e912-45cd-9209-336dc1dea3b9

   
</details>
</details>

---

## 7. 발표자료<a id="etc"></a>

![image](https://github.com/user-attachments/assets/7d4115b3-ab40-4c87-bcb1-6391a1e8dadd)

![image](https://github.com/user-attachments/assets/3043a1ec-9cad-41c6-8263-a5996e631249)





# 실행 명령어(Dockerfile이 위치한 경로에서 실행)
# $ docker build -t [이미지 이름] .
# $ docker run --name [컨테이너 이름] -itd [이미지 이름]
# $ docker exec -it [컨테이너 이름] bash
# COPY가 진행되었는지 확인

# $ docker run --name [컨테이너 이름] [이미지 이름]
# app.js 실행됨 (Hello, world!)


# # 베이스이미지 지정
# FROM node:lts

# # [호스트] 파일 또는 폴더를 [컨테이너]로 복사
# # COPY [호스트 파일] [컨테이너 경로]
# COPY ./app.js /app.js
# # 실행하고 싶은 명령어 문자열을 입력
# CMD ["node", "app.js"]


# ------------------------------
# 실행 명령어
# $ docker build -t my-node .
# $ docker run -itd --name node-container my-node
# $ docker exec -it node-container bash

FROM node:lts
WORKDIR /app
COPY ./package.json ./
RUN npm install
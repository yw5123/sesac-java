# 아래 정보를 기반으로 Dockerfile 작성
# - 베이스 이미지 : `nginx:stable`
# - 포트 명시 : `80`
# - 파일 복사 : [호스트] `index.html` → [컨테이너] `/usr/share/nginx/html/`
# - 컨테이너 실행 명령어 : `["nginx", "-g", "daemon off;"]`

FROM nginx:stable
EXPOSE 80
COPY ./index.html /usr/share/nginx/html/
CMD ["nginx", "-g", "daemon off;"]

# 이미지 빌드
# - 이미지 이름 : my-nginx
# $ docker build -t my-nginx .

# 5. 컨테이너 생성 및 실행
# - 컨테이너 이름 : my-nginx-container
# - 백그라운드 실행
# - 포트 매핑 : `80:80`
# $ docker run --name my-nginx-container -d my-nginx -p 80:80
# $ docker run -p 80:80 --name my-nginx-container -d my-nginx
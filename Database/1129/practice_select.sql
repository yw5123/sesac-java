-- 1. 모든 영화의 제목과 대여료를 조회하시오.
SELECT title AS '제목', rental_rate AS '대여료' FROM film;

-- 2. 대여료가 4달러 이상인 영화의 제목과 대여료를 조회하시오.
SELECT title AS '제목', rental_rate AS '대여료'
FROM film
WHERE
    rental_rate >= 4.00;

-- 3. 등급별 영화 수를 조회하시오.
SELECT rating AS '등급', COUNT(*) AS '영화 수'
FROM film
GROUP BY
    rating;

-- 4. 상영 시간을 중복 제거하여 내림차순으로 정렬하고, 상위 10개를 조회하시오.
SELECT DISTINCT
    length AS '상영시간'
FROM film
ORDER BY length DESC
LIMIT 10;

-- 5. 대여 기간별 영화 수를 대여 기간 내림차순으로 정렬하여 조회하시오.
SELECT rental_duration AS '대여 기간', COUNT(*) AS '영화 수'
FROM film
GROUP BY
    rental_duration
ORDER BY rental_duration DESC;

-- 6. 대여 기간이 5일 이상이고 대여료가 4달러 이상인 영화의 제목, 대여 기간, 대여료를 조회하시오.
SELECT
    title AS '제목',
    rental_duration AS '대여 기간',
    rental_rate AS '대여료'
FROM film
WHERE
    rental_duration >= 5
    and rental_rate >= 4;

-- 7. 등급이 'R'인 영화 중 처음 10개의 제목과 등급을 조회하시오.
SELECT title AS '제목', rating AS '등급'
FROM film
WHERE
    rating = 'R'
LIMIT 10;

-- 8. 대여료별 영화 수를 영화 수 내림차순으로 정렬하여 조회하시오.
SELECT rental_rate AS '대여료', COUNT(*) AS '영화 수'
FROM film
GROUP BY
    rental_rate
ORDER BY rental_rate DESC;

-- 9. 교체 비용별 영화 수와 평균 대여료를 교체 비용 오름차순으로 정렬하여 조회하시오.
SELECT replacement_cost AS '교체 비용', COUNT(*) AS '영화 수', AVG(rental_rate) AS '평균 대여료'
FROM film
GROUP BY
    replacement_cost
ORDER BY replacement_cost;

-- 10. 제목에 'angel'이 포함된 영화의 제목을 조회하시오.
SELECT title AS '제목' FROM film WHERE title LIKE '%angel%';

-- 11. 등급별 평균 대여료가 3달러 미만인 등급과 평균 대여료를 조회하시오.
SELECT rating AS '등급', AVG(rental_rate) AS '평균 대여료'
FROM film
GROUP BY
    rating
HAVING
    AVG(rental_rate) < 3;

-- 12. 상영 시간이 10번째에서 15번째로 긴 영화의 제목과 상영 시간을 조회하시오. (상영 시간이 같을 경우 제목 오름차순으로 정렬)
SELECT title AS '제목', length AS '상영 시간'
FROM film
ORDER BY length DESC, title ASC
Limit 6
OFFSET
    9;

-- 13. 등급이 'PG' 또는 'G'이면서 대여 기간이 4일 이하인 영화의 제목, 등급, 대여 기간을 조회하시오.
SELECT
    title AS '제목',
    rating AS '등급',
    rental_duration AS '대여 기간'
FROM film
WHERE
    rating in ('PG', 'G')
    and rental_duration <= 4;

-- 14. 등급별 영화 수와 평균 상영 시간을 조회하시오.
SELECT rating AS '등급', COUNT(*) AS '영화 수', AVG(length) AS '평균 상영 시간'
FROM film
GROUP BY
    rating;

-- 15. 상영 시간이 60분 이상 120분 이하인 영화의 제목과 상영 시간을 상영 시간 오름차순으로 조회하시오.
SELECT title AS '제목', length AS '상영 시간'
FROM film
WHERE
    length BETWEEN 60 AND 120
ORDER BY length ASC;

-- 1. 배우가 출연한 영화의 제목을 조회
SELECT a.first_name AS "이름", a.last_name AS "성", f.title AS "영화 제목"
FROM actor a
INNER JOIN film_actor fa ON a.actor_id = fa.actor_id
INNER JOIN film f ON fa.film_id = f.film_id;

-- 2. first_name이 `PENELOPE` 인 배우가 출연한 영화의 제목을 조회
SELECT f.title AS "영화 제목"
FROM actor a
INNER JOIN film_actor fa ON a.actor_id = fa.actor_id
INNER JOIN film f ON fa.film_id = f.film_id
WHERE a.first_name = "PENELOPE";

-- 3. 영화 별 출연 배우의 수를 조회
SELECT f.title AS "영화", COUNT(a.actor_id) AS "출연 배우 수"
FROM film f
INNER JOIN film_actor fa ON f.film_id = fa.film_id
INNER JOIN actor a ON fa.actor_id = a.actor_id
GROUP BY f.film_id;

-- 4. 영화 별 출연 배우의 수가 5가 넘는 데이터를 배우의 수가 큰순으로 조회
SELECT f.title AS "영화", COUNT(a.actor_id) AS "출연 배우 수"
FROM film f
INNER JOIN film_actor fa ON f.film_id = fa.film_id
INNER JOIN actor a ON fa.actor_id = a.actor_id
GROUP BY f.title
HAVING COUNT(a.actor_id) > 5
ORDER BY COUNT(a.actor_id) DESC;

--------------------------------------------------

-- 5. 고객의 대여 정보 조회
SELECT c.first_name AS "이름", c.last_name AS "성", r.rental_date AS "대여 날짜", return_date AS "반납 날짜"
FROM customer c
INNER JOIN rental r ON c.customer_id = r.customer_id;

-- 6. 고객이 대여한 영화 정보 조회
SELECT c.first_name AS "이름", c.last_name AS "성", f.title AS "영화", r.rental_date AS "대여 날짜", return_date AS "반납 날짜"
FROM customer c
INNER JOIN rental r ON c.customer_id = r.customer_id
INNER JOIN inventory i ON r.inventory_id = i.inventory_id
INNER JOIN film f ON i.film_id = f.film_id
ORDER BY c.first_name, c.last_name;

-- 7. `ACADEMY DINOSAUR` 영화를 대여한 고객 정보 조회
SELECT c.first_name AS "이름", c.last_name AS "성", f.title AS "영화", r.rental_date AS "대여 날짜", return_date AS "반납 날짜"
FROM customer c
INNER JOIN rental r ON c.customer_id = r.customer_id
INNER JOIN inventory i ON r.inventory_id = i.inventory_id
INNER JOIN film f ON i.film_id = f.film_id
WHERE f.title = "ACADEMY DINOSAUR";

--------------------------------------------------

-- 8. 배우별로 출연한 영화의 등급(rating)을 조회
SELECT DISTINCT a.first_name AS "이름", a.last_name AS "성", f.rating AS "등급"
FROM actor a
INNER JOIN film_actor fa ON a.actor_id = fa.actor_id
INNER JOIN film f ON fa.film_id = f.film_id;

-- 9. 1번 고객이 자주 대여한 영화의 카테고리를 찾으시오
SELECT ca.name AS "카테고리", COUNT(*) AS "대여 수"
FROM customer cu
INNER JOIN rental r ON cu.customer_id = r.customer_id
INNER JOIN inventory i ON r.inventory_id = i.inventory_id
INNER JOIN film f ON i.film_id = f.film_id
INNER JOIN film_category fc ON f.film_id = fc.film_id
INNER JOIN category ca ON fc.category_id = ca.category_id
WHERE cu.customer_id = 1
GROUP BY ca.name
ORDER BY COUNT(*) DESC
LIMIT 1;

-- 10. 각 직원이 일하는 매장의 주소와 도시를 조회
SELECT s.first_name AS "이름", s.last_name AS "성", a.address AS "주소", c.city AS "도시"
FROM staff s
JOIN store st ON s.store_id = st.store_id
JOIN address a ON st.address_id = a.address_id
JOIN city c ON a.city_id = c.city_id;

-- 11. 고객별로 대여한 영화 제목과 지불한 금액, 날짜를 조회
SELECT c.first_name AS "이름", c.last_name AS "성", f.title AS "영화", p.amount AS "지불한 금액", p.payment_date AS "날짜"
FROM customer c
JOIN rental r ON c.customer_id = r.customer_id
JOIN inventory i ON r.inventory_id = i.inventory_id
JOIN film f ON i.film_id = f.film_id
JOIN payment p ON r.rental_id = p.rental_id;

-- 12. 국가별 고객 수를 조회
SELECT co.country AS "국가", COUNT(cu.customer_id) AS "고객 수"
FROM country co
JOIN city ci ON co.country_id = ci.country_id
JOIN address ad ON ci.city_id = ad.city_id
JOIN customer cu ON ad.address_id = cu.address_id
GROUP BY co.country
ORDER BY COUNT(cu.customer_id) DESC;

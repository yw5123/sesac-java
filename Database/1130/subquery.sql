-- 평균 대여 금액(rental_rate)보다 비싼 영화를 조회하시오
SELECT title, rental_rate
FROM film
WHERE rental_rate > (
    SELECT AVG(rental_rate)
    FROM film
);

-- 평균 대여 금액을 같이 출력하고 싶으면
-- 이런 식으로 서브쿼리를 사용할 수 있음
SELECT title, rental_rate, (
    SELECT AVG(rental_rate)
    FROM film
)
FROM film
WHERE rental_rate > (
    SELECT AVG(rental_rate)
    FROM film
);

-- 대여 횟수가 40회 이상인 고객이 대여한 영화들을 조회하시오 
SELECT title
FROM film
WHERE film_id IN (
    SELECT film_id
    FROM inventory
    WHERE inventory_id IN (
        SELECT inventory_id
        FROM rental
        WHERE customer_id IN (
            SELECT customer_id
            FROM rental
            GROUP BY customer_id
            HAVING COUNT(*) >= 40
        )
    )
);

SELECT DISTINCT title
FROM film 
WHERE film_id IN (
    SELECT i.film_id
    FROM rental r
    JOIN inventory i ON r.inventory_id = i.inventory_id
    WHERE r.customer_id IN (
        SELECT customer_id
        FROM rental
        GROUP BY customer_id
        HAVING COUNT(*) >= 40
    )
);

-- Action 카테고리 영화를 한번도 빌린적 없는 고객을 조회하시오
SELECT c.first_name, c.last_name
FROM customer c
WHERE NOT EXISTS (
    SELECT 1
    FROM rental r
    JOIN inventory i ON r.inventory_id = i.inventory_id
    JOIN film_category fc ON i.film_id = fc.film_id
    JOIN category cat ON fc.category_id = cat.category_id
    WHERE r.customer_id = c.customer_id
    AND cat.name = 'Action'
);

SELECT c.first_name, c.last_name
FROM customer c
WHERE c.customer_id NOT IN (
    SELECT r.customer_id
    FROM rental r
    JOIN inventory i ON r.inventory_id = i.inventory_id
    JOIN film_category fc ON i.film_id = fc.film_id
    JOIN category cat ON fc.category_id = cat.category_id
    WHERE cat.name = 'Action'
);
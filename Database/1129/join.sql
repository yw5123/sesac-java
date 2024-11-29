-- 도시와 국가 정보 연결(1:N)
SELECT city.Name as CityName, country.Name as CountryName, country.Continent
FROM city
    INNER JOIN country ON city.CountryCode = country.Code
-- 국가의 입장에서 국가가 가지고 있는 도시를 함께 조회
SELECT country.Name, city.Name
FROM country
    INNER JOIN city ON country.Code = city.CountryCode;

-- WHERE 사용
SELECT country.Name, city.Name
FROM country
    INNER JOIN city ON country.Code = city.CountryCode
WHERE
    country.code = 'KOR'
ORDER BY city.Name;

--------------------------------------------------

-- 배우가 출연한 영화 조회
SELECT a.first_name, a.last_name, f.title
FROM
    actor a
    LEFT JOIN film_actor fa ON a.actor_id = fa.actor_id
    LEFT JOIN film f ON fa.film_id = f.film_id;
-- 5462개

SELECT a.first_name, a.last_name, f.title
FROM
    film f
    LEFT JOIN film_actor fa ON f.film_id = fa.film_id
    LEFT JOIN actor a ON fa.actor_id = a.actor_id;
-- 5465개

-- 3개 차이가 나는데 어디서 차이가 발생하는지 찾아보기

SELECT a.first_name, a.last_name, f.title
FROM
    film f
    LEFT JOIN film_actor fa ON f.film_id = fa.film_id
    LEFT JOIN actor a ON fa.actor_id = a.actor_id
WHERE
    fa.actor_id IS NULL;
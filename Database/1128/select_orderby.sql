-- country 테이블에서 대륙별로 정렬하고, 같은 대륙 내에서는 GNP가 높은 순으로 정렬하여 Name, Continent, GNP을 조회하시오
SELECT Name, Continent, GNP FROM country ORDER BY Region, GNP DESC;

-- country 테이블에서 기대수명이 짧은 순으로 정렬하되, NULL값은 마지막에 나오도록 정렬하여 Name, LifeExpectancy을 조회하시오
SELECT Name, LifeExpectancy
FROM country
ORDER BY LifeExpectancy IS NULL, LifeExpectancy;

-- 대륙 별 국가 수가 많은 순서대로 Continent, 국가 수를 조회하시오
SELECT Continent, COUNT(*) AS CountryCount
FROM country
GROUP BY
    Continent
ORDER BY CountryCount DESC;

-- 독립년도가 있는 국가들의 대륙 별 평균 기대수명이 높은 순서대로 Continent, 평균 기대수명을 조회하시오
SELECT Continent, AVG(LifeExpectancy) as AverageAge
FROM country
WHERE
    IndepYear IS NOT NULL
GROUP BY
    Continent
ORDER BY AverageAge DESC;
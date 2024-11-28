-- 각 국가별 도시가 10개 이상인 국가의 CountryCode, 도시 수를 조회하시오
SELECT CountryCode, COUNT(*) as CityCount
FROM city
GROUP BY
    CountryCode
HAVING
    COUNT(*) >= 10;

-- District별 평균 인구가 100만 이상이면서 도시 수가 3개 이상인 District,  도시 수, 총 인구를 구하시오
SELECT
    District,
    COUNT(*) AS CityCount,
    SUM(Population) AS TotalPopulation
FROM city
GROUP BY
    District
HAVING
    AVG(Population) >= 1000000
    and COUNT(*) >= 3;

-- 아시아 대륙의 국가들 중에서, Region별 평균 GNP가 1000 이상인 Region,  평균 GNP를 조회하시오
SELECT Region, AVG(GNP) as GNPAverage
FROM country
WHERE
    Continent = 'Asia'
GROUP BY
    Region
HAVING
    GNPAverage >= 1000;

-- 독립년도가 1900년 이후인 국가들 중에서, 대륙별 평균 기대수명이 70세 이상인 Continent, 평균 기대수명을 조회하시오
SELECT Continent, AVG(LifeExpectancy) AS AverageAge
FROM country
WHERE
    IndepYear >= 1900
GROUP BY
    Continent
HAVING
    AverageAge >= 70;

-- CountryCode별 도시 평균 인구가 100만 이상이고 도시 최소 인구가 50만 이상인 CountryCode, 총 도시수, 총 인구수를 조회하시오
SELECT
    CountryCode,
    COUNT(*) AS CityCount,
    SUM(Population) AS TotalPopulation
FROM city
GROUP BY
    CountryCode
HAVING
    AVG(Population) >= 1000000
    and MIN(Population) >= 500000;
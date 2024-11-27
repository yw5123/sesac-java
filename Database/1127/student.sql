-- 테이블 생성
CREATE TABLE student (
    student_id VARCHAR(7) PRIMARY KEY,
    name VARCHAR(10),
    grade INT,
    major VARCHAR(20)
);

-- 테이블 수정
ALTER TABLE student ADD phone VARCHAR(20);

ALTER TABLE student DROP COLUMN phone;

-- 외래키가 있는 테이블 생성
CREATE TABLE attendance (
    attendance_id INT AUTO_INCREMENT PRIMARY KEY,
    student_id VARCHAR(7) REFERENCES student (student_id),
    date DATE,
    status VARCHAR(10)
);

-- 테이블 삭제
DROP TABLE attendance;

-- 새로운 데이터 추가
INSERT INTO
    student (
        student_id,
        name,
        grade,
        major
    )
VALUES ('2024001', '김철수', 1, '컴퓨터공학');

INSERT INTO
    student
VALUES ('2024002', '이영희', 2, '경영학'),
    ('2024003', '박민수', 3, '물리학');

-- 학생의 이름을 조회하자
SELECT name FROM student;

SELECT s.name from student s;

-- grade가 1인 학생의 모든 정보를 출력하자
SELECT * FROM student WHERE grade = 1;

-- 데이터 수정
UPDATE student
SET
    grade = 2,
    major = '경제학'
WHERE
    student_id = '2024001';

-- 데이터 삭제
DELETE FROM student WHERE student_id = '2024002';
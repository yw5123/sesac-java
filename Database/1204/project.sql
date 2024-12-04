
-- 팀프로젝트
-- 인터넷 강의 사이트 ERD 만들고 쿼리문 및 API 작성 (1203~1206)

SELECT t.teacher_id, u.name
FROM user u
JOIN teacher t ON u.user_id = t.user_id
LEFT JOIN favorite_teacher ft ON t.teacher_id = ft.teacher_id
GROUP BY t.teacher_id
ORDER BY COUNT(ft.teacher_id) DESC
LIMIT 3;

SELECT t.teacher_id, u.name, t.introduce
FROM user u
JOIN teacher t ON u.user_id = t.user_id
LEFT JOIN favorite_teacher ft ON t.teacher_id = ft.teacher_id
GROUP BY t.teacher_id
ORDER BY COUNT(ft.teacher_id) DESC;

SELECT c.course_id, c.name, c.introduce, u.name, c.start_date
FROM course c
JOIN teacher t ON c.teacher_id = t.teacher_id
JOIN user u ON t.user_id = u.user_id
WHERE c.is_progressing = TRUE
ORDER BY c.start_date DESC
LIMIT 3;

SELECT p.post_id, f.forum_name, p.title, u.name, p.date, COUNT(c.comment_id)
FROM post p
JOIN forum f ON p.forum_id = f.forum_id
JOIN user u ON p.user_id = u.user_id
LEFT JOIN comment c ON p.post_id = c.post_id
GROUP BY p.post_id;

SELECT f.forum_name, p.title, u.name, p.date, p.content, p.attachment, COUNT(c.comment_id)
FROM post p
JOIN forum f ON p.forum_id = f.forum_id
JOIN user u ON p.user_id = u.user_id
LEFT JOIN comment c ON p.post_id = c.post_id
WHERE p.post_id = 2
GROUP BY p.post_id;

SELECT c.comment_id, u.name, c.content, c.date, c.parent_id
FROM comment c
JOIN user u ON c.user_id = u.user_id
JOIN post p ON c.post_id = p.post_id
WHERE p.post_id = 2;

SELECT c.name, u1.name, c.introduce, c.duration
FROM course c
JOIN teacher t ON c.teacher_id = t.teacher_id
JOIN user u1 ON t.user_id = u1.user_id
JOIN course_student cs ON c.course_id = cs.course_id
JOIN student s ON cs.student_id = s.student_id
JOIN user u2 ON s.user_id = u2.user_id
WHERE u2.user_id = 8;

SELECT u1.name, t.introduce
from teacher t
JOIN user u1 ON t.user_id = u1.user_id
JOIN favorite_teacher ft ON t.teacher_id = ft.teacher_id
JOIN student s ON ft.student_id = s.student_id
JOIN user u2 ON s.user_id = u2.user_id
WHERE u2.user_id = 6;

SELECT c.name, u1.name, c.introduce, c.duration
FROM course c
JOIN teacher t ON c.teacher_id = t.teacher_id
JOIN user u1 ON t.user_id = u1.user_id
JOIN favorite_course fc ON c.course_id = fc.course_id
JOIN student s ON fc.student_id = s.student_id
JOIN user u2 ON s.user_id = u2.user_id
WHERE u2.user_id = 7;

SELECT c.comment_id, u.name, c.content, c.date, c.parent_id, p.post_id, p.title
FROM comment c
JOIN user u ON c.user_id = u.user_id
JOIN post p ON c.post_id = p.post_id
WHERE u.user_id = 8;
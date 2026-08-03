CREATE TABLE attendance (
    attendance_id SERIAL PRIMARY KEY,
    emp_id INT,
    attendance_date DATE,
    status TEXT
);

CREATE OR REPLACE PROCEDURE count_absent_days()
LANGUAGE plpgsql
AS $$
DECLARE
    rec RECORD;
BEGIN
    FOR rec IN
        SELECT emp_id,
               COUNT(*) AS absent_days
        
    END LOOP;
END;
$$;
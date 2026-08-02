CREATE OR REPLACE FUNCTION total_marks(
    mark1 INT,
    mark2 INT,
    mark3 INT
)
RETURNS INT
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN mark1 + mark2 + mark3;
END;
$$;

CREATE OR REPLACE PROCEDURE student_result(
    mark1 INT,
    mark2 INT,
    mark3 INT
)
LANGUAGE plpgsql
AS $$
DECLARE
    total INT;
BEGIN
    total := total_marks(mark1, mark2, mark3);

    RAISE NOTICE 'Total Marks : %', total;

    IF total >= 150 THEN
        RAISE NOTICE 'Result : PASS';
    ELSE
        RAISE NOTICE 'Result : FAIL';
    END IF;
END;
$$;

CALL student_result(60, 55, 50);

CREATE OR REPLACE FUNCTION calculate_si(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
RETURNS NUMERIC
LANGUAGE plpgsql
AS $$
BEGIN
    RETURN (principal * rate * time) / 100;
END;
$$;

CREATE OR REPLACE PROCEDURE display_interest(
    principal NUMERIC,
    rate NUMERIC,
    time NUMERIC
)
LANGUAGE plpgsql
AS $$
DECLARE
    si NUMERIC;
    total_amount NUMERIC;
BEGIN
    si := calculate_si(principal, rate, time);

    total_amount := principal + si;

    RAISE NOTICE 'Principal Amount : %', principal;
    RAISE NOTICE 'Simple Interest  : %', si;
    RAISE NOTICE 'Total Amount     : %', total_amount;
END;
$$;

CALL display_interest(10000, 5, 2);
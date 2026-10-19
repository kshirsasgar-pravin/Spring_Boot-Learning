
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="tca" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>User Registration Form</title>

    <style>
        * {
            box-sizing: border-box;
        }

        body {
            margin: 0;
            font-family: Arial, sans-serif;
            background: linear-gradient(135deg, #dbeafe, #e9d5ff);
            min-height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            padding: 30px 15px;
        }

        .form-container {
            width: 100%;
            max-width: 450px;
            background: white;
            padding: 35px;
            border-radius: 15px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
        }

        h2 {
            text-align: center;
            color: #4338ca;
            margin-bottom: 28px;
        }

        .form-group {
            margin-bottom: 20px;
        }

        .form-group > label {
            display: block;
            font-weight: bold;
            margin-bottom: 8px;
            color: #374151;
        }

        .form-input {
            width: 100%;
            padding: 12px;
            border: 1px solid #d1d5db;
            border-radius: 7px;
            font-size: 15px;
            outline: none;
            transition: border-color 0.2s, box-shadow 0.2s;
        }

        .form-input:focus {
            border-color: #6366f1;
            box-shadow: 0 0 0 3px rgba(99, 102, 241, 0.15);
        }

        .gender-options {
            display: flex;
            gap: 22px;
            margin-top: 10px;
        }

        .gender-options label {
            display: flex;
            align-items: center;
            gap: 7px;
            color: #374151;
            cursor: pointer;
        }

        .error {
            display: block;
            color: #dc2626;
            font-size: 13px;
            margin-top: 5px;
        }

        .submit-btn {
            width: 100%;
            padding: 13px;
            margin-top: 10px;
            background: #4f46e5;
            color: white;
            font-size: 16px;
            font-weight: bold;
            border: none;
            border-radius: 7px;
            cursor: pointer;
            transition: background 0.2s;
        }

        .submit-btn:hover {
            background: #3730a3;
        }
    </style>
</head>

<body>

<div class="form-container">
    <h2>User Registration</h2>

    <tca:form modelAttribute="user"
              method="POST"
              action="${pageContext.request.contextPath}/register">

        <div class="form-group">
            <label for="name">User Name</label>
            <tca:input path="name" id="name"
                       cssClass="form-input"/>
            <tca:errors path="name" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="email">Email Address</label>
            <tca:input path="email" id="email"
                       cssClass="form-input"/>
            <tca:errors path="email" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="mobile">Mobile Number</label>
            <tca:input path="mobile" id="mobile"
                       cssClass="form-input"
                       type="tel"/>
            <tca:errors path="mobile" cssClass="error"/>
        </div>

        <div class="form-group">
            <label for="birth-date">Birth Date</label>
            <tca:input path="birthDate" id="birthDate" type = "date"
                       cssClass="form-input"/>
            <tca:errors path="birthDate" cssClass="error"/>
        </div>

        <div class="form-group">
            <label>Gender</label>

            <div class="gender-options">
                <label>
                    <tca:radiobutton path="gender" value="Male"/>
                    Male
                </label>

                <label>
                    <tca:radiobutton path="gender" value="Female"/>
                    Female
                </label>
            </div>

            <tca:errors path="gender" cssClass="error"/>
        </div>

        <button type="submit" class="submit-btn">
            Register
        </button>

    </tca:form>
</div>

</body>
</html>

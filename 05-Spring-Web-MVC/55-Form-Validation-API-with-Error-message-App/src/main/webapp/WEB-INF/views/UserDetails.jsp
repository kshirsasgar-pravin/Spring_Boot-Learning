
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
        <meta charset="UTF-8">
        <title>User Details</title>

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
                        padding: 20px;
                }

                .details-container {
                        width: 100%;
                        max-width: 500px;
                        background: white;
                        padding: 35px;
                        border-radius: 15px;
                        box-shadow: 0 8px 25px rgba(0, 0, 0, 0.12);
                }

                h2 {
                        text-align: center;
                        color: #4338ca;
                        margin-bottom: 25px;
                }

                .detail-row {
                        display: flex;
                        justify-content: space-between;
                        align-items: flex-start;
                        gap: 15px;
                        padding: 15px 0;
                        border-bottom: 1px solid #e5e7eb;
                }

                .detail-row:last-of-type {
                        border-bottom: none;
                }

                .detail-label {
                        color: #374151;
                        font-weight: bold;
                }

                .detail-value {
                        color: #4f46e5;
                        text-align: right;
                        overflow-wrap: anywhere;
                }

                .back-btn {
                        display: block;
                        text-align: center;
                        text-decoration: none;
                        background: #4f46e5;
                        color: white;
                        padding: 13px;
                        margin-top: 25px;
                        border-radius: 7px;
                        font-weight: bold;
                        transition: background 0.2s;
                }

                .back-btn:hover {
                        background: #3730a3;
                }
        </style>
</head>

<body>

<div class="details-container">

        <h2>Registration Successful!</h2>

        <div class="detail-row">
                <span class="detail-label">User Name</span>
                <span class="detail-value">${name}</span>
        </div>

        <div class="detail-row">
                <span class="detail-label">Email</span>
                <span class="detail-value">${email}</span>
        </div>

        <div class="detail-row">
                <span class="detail-label">Mobile</span>
                <span class="detail-value">${mobile}</span>
        </div>

        <div class="detail-row">
                <span class="detail-label">Date Of Birth</span>
                <span class="detail-value">${birthDate}</span>
        </div>

        <div class="detail-row">
                <span class="detail-label">Gender</span>
                <span class="detail-value">${gender}</span>
        </div>

        <a href="${pageContext.request.contextPath}/form"
           class="back-btn">Back to Registration</a>

</div>

</body>
</html>

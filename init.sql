USE database;

CREATE TABLE IF NOT EXISTS member (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    phone VARCHAR(50),
    password VARCHAR(50) NOT NULL,
    created_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP,  -- 創建時間，默認當前時間
    updated_ts TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP -- 更新時間，自動更新
    );

INSERT INTO member (name, email, phone, password) VALUES
    ('Alice', 'alice@example.com', '123456789', 'alice'),
    ('Bob', 'bob@example.com', '987654321', 'bob');

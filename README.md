Blog Uygulaması

Bu proje, Spring Boot kullanılarak geliştirilmiş bir blog uygulamasıdır. Kullanıcılar blog yazıları oluşturabilir, kategorilere ayırabilir ve diğer kullanıcıların içeriklerini görebilir. MySQL veritabanı kullanılarak daha sağlam ve ölçeklenebilir bir altyapı sağlanmıştır.
----------------------------------------------------------

🚀 Özellikler

Kullanıcı Yönetimi:

Kullanıcılar blog yazıları oluşturabilir, düzenleyebilir ve silebilir.

Blog Yönetimi:

Blog yazıları için CRUD (Create, Read, Update, Delete) işlemleri.

Kategori Yönetimi:

Blog yazılarına kategori ekleme.

API Desteği:

RESTful API ile veriye erişim ve yönetim.

MySQL Veritabanı Entegrasyonu:

Kalıcı ve güvenilir bir veritabanı.

----------------------------------------------------------
🛠️ Teknolojiler

Java: Projenin temel programlama dili
.
Spring Boot: Uygulamanın geliştirilmesi için kullanılan çerçeve.

Spring Data JPA: Veritabanı işlemleri için.

MySQL: Kalıcı veritabanı için.

Spring Security (Opsiyonel): Yetkilendirme ve kimlik doğrulama.

----------------------------------------------------------
🗄️ Veritabanı Yapısı

MySQL kullanılarak aşağıdaki tablolar otomatik olarak oluşturulacaktır:

----------------------------------------------------------
user:

id, username, email, password

----------------------------------------------------------
post:

id, title, content, created_date, user_id, category_id

----------------------------------------------------------
category:

id, name

----------------------------------------------------------
🖥️ API Endpoints

HTTP Metodu	Endpoint	Açıklama

GET	/api/posts	Tüm blog yazılarını getirir.

GET	/api/posts/{id}	ID ile bir blog yazısını getirir.

POST	/api/posts	Yeni bir blog yazısı ekler.

PUT	/api/posts/{id}	Bir blog yazısını günceller.

DELETE	/api/posts/{id}	Bir blog yazısını siler.
----------------------------------------------------------



![MuratBlogApplication](https://github.com/user-attachments/assets/b080eb17-9d03-4413-b7de-3623c1648f56)

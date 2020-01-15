ÖZET

Bu proje enstitü’nün güçlü ve modern alt yapısını yakın çevresinde yer alanlar başta olmak üzere, ülke sanayi kuruluşları ile iş birliği içinde çalışarak sorunların çözümüne katkıda bulunmak amacı ile sanayi kuruluşlarının uluslararası pazarlama da ülkelerin özel günlerine, özel taslaklar üzerinden dil çeviri desteği ile birlikte bilgilendirme platformu sağlamak amacı ile tasarlanmıştır. Proje kapsamında özel günler bilgilendirme içerikleri, dil çeviri desteği ve kullanıcılara mail üzerinden bildirim   arayüzleri bulunmaktadır. Bu bildirimlerin bir panel üzerinden güncel olarak takibi sağlanabilmektedir.


SUMMARY

This project is necessary to close the institute's strong and modern infrastructure, to determine that the areas caused by the solution of problems by working in cooperation with the country used industry. platform to ensure. Special days are for informing, language translation and notification interfaces to users via e-mail. These notifications can be followed up-to-date via a panel.


PROJE TANIMI

Sanayi kuruluşlarının uluslararası pazarlama da ülkelerin özel günlerine, özel taslaklar üzerinden dil çeviri desteği ile birlikte bilgilendirme platformu sağlamak amacı ile proje kapsamında ülkelerin özel günlerine göre taslaklar tasarlanmıştır ve ek olarak taslaklar bir arayüz üzerinden görüntülenebilir, eklenebilir ve çıkarılabilmektedir. Bu taslaklar dil çeviri desteği ile kaydedilebilir ve gönderilebilmektedir. Firmaların uluslararası müşterilerine pazarlamayı sağlanabilmesi için sms ve email olarak bilgilendirme yapılabilecek alt yapı tasarlanmıştır. 

PROJENİN NEDEN VE AMAÇLARI

    • Enstitü’nün e-ticaret kuruluşlarını uluslararası pazarda tanıtmak. 
    • Teknolojinin avantajları ile ilgili insan kaynaklarını bir araya getirerek ülke değerlerinin gelişmesini sağlamak.
    • Ülke değerlerinin uluslararası pazarda tanıtımını sağlayarak, ülke ekonomisine katkıda bulunmak. 
    • Türk Sanayi’nin rekabet gücünü uluslararası alanda yükseltmek 
    • Uluslararası bilgilendirmelerin tek platform üzerinden yönetilerek takibini sağlamak ve diğer ülke vatandaşlarının özel değerlerine önem göstermek. 


Projede içerikleri

    • Ajanda
        ◦ Özel günlerinin ve etkinliklerin takibi
    • Çeviri
        ◦ Mail içeriklerinin bir çok dilde çevrilebilmesi
        ◦ Çevirilerin mail alanına aktarılabilmesi
    • Mail
    	◦ Mail gönderim sayfası
	◦ Mevcut Mail taslak tasarımlarının listelenmesi ve mail gönderim sayfasına aktarılması
        ◦ Gönderilen maillerin listelenmesi

Bu proje Java dilinde, MVC tasarım desenine uygun olarak "Spring framework" kullanılarak oluşturulmuştur.
Proje veri depolama birimi olarak mysql veri tabanı kullanılmış olup, hybernate desteği olan veri tabanlarında kullanılabilmektedir.

Proje çalıştırmadan önce application.properties içerisinde 
	aşağıda belirtilen alanlar güncellenmelidir.

spring.mail.username=[COMPANY_MAIL_ADDRESS]
spring.mail.password=[MAIL_PASSWORD]

 Enable application access: https://myaccount.google.com/u/0/lesssecureapps?pageId=none
 Bu URL ile gmail hesabınızın app tarafından kullanım iznini aktif etmelisiniz.

 Spring DATASOURCE (DataSourceAutoConfiguration & DataSourceProperties)
spring.datasource.url=jdbc:mysql://localhost:3306/tn?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username=[DB_USER_NAME]
spring.datasource.password=[DB_PASSOWRD]


	
Bu rapor 141044078 numaralı G.T.Ü. Bilgisayar Mühendisliği Bölümü Lisans öğrencisi Aydın Çalıkoğlu’nun E-ticaret pazarlama yönetim sistemlerinde çok dilli çok uluslu yapılar projesi için bilgilendirme raporudur.

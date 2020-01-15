

İÇİNDEKİLER

ÖNSÖZ.	v
İÇİNDEKİLER	VI
ŞEKİL LİSTESİ	VII
KISALTMA LİSTESİ	VIII
ÖZET		1
SUMMARY	2
1.GİRİŞ	3
1.1. PROJE TANIMI	3
1.2. PROJENİN NEDEN VE AMAÇLARI	4
2.TEORİK ALTYAPI VE İLGİLİ ÇALIŞMALAR	5
2.1. Web Uygulama Mimarileri	5
2.2. Alt Yapı Araştırmaları	7
2.2.1. Web Geliştirme Dilleri	7
2.2.2. Veri depolama	9
3. PROJE SÜREÇLERİ	11
3.1. Proje Gereksinimlerinin Belirlenmesi	11
3.2. Projelerde Gerekli Alanların Belirlenmesi	12
3.3. Proje Temelinin Oluşturulması	13
3.4. Proje Arayüz Tasarım Planı	14
3.5. UML DİYAGRAMLARI	16
3.5.1. Use Case Diyagramı	16
3.5.2. Class Diyagramı	17
3.5.3. Veri Tabanı EER Diyagramı	18
3.5.3. Sequence Diyagramı	19
3.6. Sistem Kullanım Mimarisi	20
3.7. VERİ TASARIMI	21
3.7.1. Kullanılan Dil ve Yapılar	21
4. KURULUM, ÇALIŞTIRMA VE KODLAMA ADIMLARI	22
4.1. Kurulumlar	22
4.2. ÇALIŞMA ADIMLARI	24
4.3. Kodlama Adımları	25
5. ARAYÜZLER	29

ŞEKİL LİSTESİ


Şekil 1.1  Genel Tasarım	3
Şekil 2.1.1 Model-View-Controller	5
Şekil 2.1.2 MVC ‘nin Web Sitelerine uygulanması	6
Şekil 3.1.1 Class Diagram: PHP ile MVC temelinin uygulanması	13
Şekil 3.4.1 Anasayfa Wireframe	14
Şekil 3.4.2 İletişim Wireframe	15
Şekil 3.4.3 Balsamiq Mockups 3 Arayüz Tasarımı	15
Şekil 3.5.1.1 Use Case Diyagramı	16
Şekil 3.5.2.1 Class Diyagramı	17
Şekil 3.5.3.1 MySQL EER Diyagramı	18
Şekil 3.5.4.1 Sequence Diyagramı	19
Şekil 3.6.1 Sistem Kullanım Mimarisi	20
Şekil 4.1.2.1  Apache Başarılı Ekranı	22
Şekil 4.1.2.2  Php Başarılı Ekranı	23
Şekil 5.1.1.  Anasayfa Tasarımı	29
Şekil 5.2.1.  İletişim Sayfa Tasarımı	30
Şekil 5.3.1.  Başvuru Sayfa Tasarımı	31
Şekil 5.4.1.  Proje Talepleri Sayfa Tasarımı	32
Şekil 5.5.1.  Devam Eden Projeler Sayfa Tasarımı	33
Şekil 5.6.1.  Tamamlanan Projeler Sayfa Tasarımı	33




















KISALTMA LİSTESİ

G.T.Ü		: Gebze Teknik Üniversitesi
UML		: Unified Modeling Language (Birleşik Modelleme Dili)
HTTP             : Hyper-Text Transfer Protocol
SQL                : Structured Query Language
XSS                : Cross-Site Scripting 
IDE                : Integrated Development Environment
LDAP		: Lightweight Directory Access Protocol
CSS		: Cascading Style Sheets (Basamaklı Stil Şablonları)
PHP		: Hypertext Preprocessor (Hiper Metin Önişlemcisi)
CURL		: Client URL Library Functions (İstemci URL Kütüphane Fonksiyonları)
URL		: Uniform Resource Locator (Tekdüze Kaynak Konumlandırıcı)
LTS		: Long Term Support (Uzun Vadeli Destek)
HTML	: Hypertext Markup Language (Hiper Metin İşaretleme Dili) 
MVC		: Model-View-Controller
SEO		: Search Engine Optimization ( arama motoru optimizasyonu )


















ÖZET


Bu proje enstitü’nün güçlü ve modern alt yapısını yakın çevresinde yer alanlar başta olmak üzere, ülke sanayi kuruluşları ile iş birliği içinde çalışarak sorunların çözümüne katkıda bulunmak amacı ile sanayi kuruluşlarının uluslararası pazarlama da ülkelerin özel günlerine, özel taslaklar üzerinden dil çeviri desteği ile birlikte bilgilendirme platformu sağlamak amacı ile tasarlanmıştır. Proje kapsamında özel günler bilgilendirme içerikleri, dil çeviri desteği ve kullanıcılara mail üzerinden bildirim   arayüzleri bulunmaktadır. Bu bildirimlerin bir panel üzerinden güncel olarak takibi sağlanabilmektedir.




















SUMMARY


This project is necessary to close the institute's strong and modern infrastructure, to determine that the areas caused by the solution of problems by working in cooperation with the country used industry. platform to ensure. Special days are for informing, language translation and notification interfaces to users via e-mail. These notifications can be followed up-to-date via a panel.




























1.GİRİŞ

Bu rapor 141044078 numaralı G.T.Ü. Bilgisayar Mühendisliği Bölümü Lisans öğrencisi Aydın Çalıkoğlu’nun Bitirme Projesi dersi için bilgilendirme raporudur. Bu başlık içerisinde projeye genel bir bakış atılacaktır.

1.1. PROJE TANIMI


Sanayi kuruluşlarının uluslararası pazarlama da ülkelerin özel günlerine, özel taslaklar üzerinden dil çeviri desteği ile birlikte bilgilendirme platformu sağlamak amacı ile proje kapsamında ülkelerin özel günlerine göre taslaklar tasarlanmıştır ve ek olarak taslaklar bir arayüz üzerinden görüntülenebilir, eklenebilir ve çıkarılabilmektedir. Bu taslaklar dil çeviri desteği ile kaydedilebilir ve gönderilebilmektedir. Firmaların uluslararası müşterilerine pazarlamayı sağlanabilmesi için sms ve email olarak bilgilendirme yapılabilecek alt yapı tasarlanmıştır. 

Şekil 1.1  Genel Tasarım


 
1.2. PROJENİN NEDEN VE AMAÇLARI

    • Enstitü’nün e-ticaret kuruluşlarını uluslararası pazarda tanıtmak. 
    • Teknolojinin avantajları ile ilgili insan kaynaklarını bir araya getirerek ülke değerlerinin gelişmesini sağlamak.
    • Ülke değerlerinin uluslararası pazarda tanıtımını sağlayarak, ülke ekonomisine katkıda bulunmak. 
    • Türk Sanayi’nin rekabet gücünü uluslararası alanda yükseltmek 
    • Uluslararası bilgilendirmelerin tek platform üzerinden yönetilerek takibini sağlamak ve diğer ülke vatandaşlarının özel değerlerine önem göstermek. 




























2.Error: Reference source not foundError: Reference source not found

2.1. Web Uygulama Mimarileri

MVC Mimarisi
Model-View-Controller (MVC), yazılım mühendisliğinde kullanılan bir “mimari desen” dir. MVC, yazdığımız uygulamanın iş mantığı ile kullanıcı arayüzünü birbirinden ayrıştıran, uygulamalarıın farklı amaçlara hizmet eden kısımlarının birbirine girmesini engelleyen yazılım mimarisidir. Bu mimari bize bakım masrafları düşük bir yazılım sağlar.

Kullanıcı arayüzü mantığı özellikle web tabanlı uygulamalarda daha sık iş mantığını değiştirmek eğilimindedir. Bir örnekle bunu açıklayacak olursak, yeni bir kullanıcı arayüzüne sayfalar eklenebilir veya elde olan sayfaların düzenlemelerinde karışıklıklar olabilir. Sonuçta uygulamayı yeniden yeniden dağıtmaya gerek kalmadan, istediğiniz zaman kullanıcı arayüzünü değiştirek, Web tabanlı ince istemci uygulamasının avantajlarından birisidir. Eğer sunum kodu ve iş mantığı tek bir nesnede birleştirilirse, kullanıcı arayüzü veriyi değiştirdiğinde, iş mantığı da her zaman içerdiği nesneyi değiştirmek zorundadır. Kullanıcı arayüzünün yaptığı en ufak bir değişiklikte bile hatalara bakmak ve bütün iş mantığını yeniden kontrol etmek gerekir.

Sadede gelirsek, MVC sayesinde Model ve View yapısını ayrıştırmış oluyoruz.


Şekil 2.1.1 Model-View-Controller
Model
Uygulamada kullanılan verileri temsil eder ve verilerin işlenme mantığının saklandığı kısımdır. Verilerin doğrulanması burada yapılır.
Genelde verilerin veritabanına kaydedilmesi ve kayıtlı yerden alınması işlemleri yine burada yapılmaktadır. 

View
Basitçe, uygulamanızın kullanıcılarınızın gözüyle gördüğü kısmıdır, arayüzdür.

Controller
Model ve View arasında veri işlemlerini gerçekleştirir. Bu kullanım bizi kod karmaşıklıklarından kurtararak düzenli, kolay anlaşılabilir ve esnek bir yapı sağlar.
Kullanıcıların View üzerinden gerçekleştirdiği işlemlerle alınan veriyi Model’e taşır, Model’den aldığı veriyi View üzerinden kullanıcıya gösterir.
MVC yapısında ana mantık Model ve View yapısının ayrılmasıdır. Bu iki yapı arasındaki haberleşmeyi sağlayan köprüye Controller diyoruz.

Proje temelinde MVC mimarisinin kullanımı bize düzenli ve kolay bir içerik yönetimi sağlayacaktır. MVC mimarisinin web sitelerinde yaygın kullanımı bulunmaktadır. Web sitelerinde yaygın kullanımı Şekil 2.1.2  bulunmaktadır.


 
Şekil 2.1.2 MVC ‘nin Web Sitelerine uygulanması











2.2. Alt Yapı Araştırmaları
2.2.1. Web Geliştirme Dilleri

Bir dilin özellikleri çalışma şekli, cevap verme şekli, kodların ne kadar kolay anlaşılabilir ve yazılabilir olduğunu ve neler başarabileceğini tanımlar. Kullanılacak olan programlama dillerinin temel özellikleri araştırılması önem taşımaktadır. 

JavaScript
JavaScript, web siteleri oluşturmak ve geliştirmek için kullanılan en popüler ve dinamik programlama dillerinden biridir. Bu dil, tarayıcıyı kontrol etme, görüntülenen bir belgenin içeriğini düzenleme, istemci tarafı komut dosyalarının kullanıcılarla iletişim kurmasına ve eşzamansız iletişim de dahil olmak üzere birçok şeyi gerçekleştirme yeteneğine sahiptir. JavaScript herhangi bir derleyici veya eklentiye ihtiyaç duymadan tüm büyük tarayıcılar tarafından kabul edilen ve desteklenen birkaç programlama dilinden biridir. 

Java
Java, web geliştirme için göz önünde bulundurabileceğiniz bir diğer popüler ve yaygın kullanılan dildir. Bu dil dünyanın her yerindeki işletmeler ve çeşitli mobil ve oyun geliştiricileri için standart bir platform görevi gören en çok talep edilen dil olmaya devam ediyor. Uygulama, çeşitli platformlarda çalışacak şekilde tasarlanmıştır. Bu, bir program Mac İşletim sistemine yazıldığında Windows tabanlı işletim sistemlerinde de çalışabileceği anlamına gelir.








Python
Python, doğada dinamik olan, çok kullanılan ve çok amaçlı bir programlama dilidir. Doğada dinamik olmak, bir geliştirici olarak kodu bir derleyiciye gerek kalmadan yazıp çalıştırabileceğiniz anlamına gelir. Dilin tasarımı kod okunabilirliğini destekleyecek şekildedir, yani sözdiziminin bir noktayı veya kavramı ifade etmek için yalnızca birkaç kod satırının gerekli olduğu anlamına gelir. Bu kod okunabilirliği kavramı, Java ve C ++ vb. Durumlarda da mümkündür. Bu, yeni başlayanların anlaması ve öğrenmesi kolay kabul edilen üst düzey veya ileri bir dildir.

CSS
CSS veya Basamaklı Stil Sayfaları daha çok bir biçimlendirme dilidir. HTML ile eşleştirildiğinde, CSS bir geliştiricinin bir web sayfasının veya web sitesinin sonunda nasıl görüneceğine veya web platformunun ziyaretçilerine nasıl görüneceğine karar vermesine ve tanımlamasına izin verir. CSS'nin üzerinde etkisi olan unsurlardan bazıları, yazı tipi boyutu, yazı tipi stili, genel düzen, renkler ve diğer tasarım öğeleridir. Düz XML belgeleri, SVG belgeleri ve XUL belgeleri dahil olmak üzere çeşitli belgelere uygulanabilen bir işaretleme dilidir. Dünya çapındaki çoğu web sitesi için, CSS, görsel olarak çekici web sayfaları oluşturmak için yardıma ihtiyaçları olup olmadığını seçmeleri için bir platformdur ve yalnızca web uygulamalarının değil mobil uygulamaların oluşturulmasında da kullanım alanı bulur.

PHP
'PHP' terimi, sadece web geliştirme için değil, aynı zamanda genel amaçlı bir programlama platformu olarak tasarlanmış ücretsiz bir sunucu tarafı kodlama dili olan PHP Hypertext İşlemci dilini tanımlamak için kullanılır . Bu, 2004 yılında oluşturulan ve şu anda dünya çapında 200 milyondan fazla web sitesine güç veren, yaygın olarak kullanılan bir dildir. 



C ++
C ++ genel bir amaçtır, iyi derlenmiş ve büyük küçük harfe duyarlı bir web programlama dilidir, sadece zorunlu değildir, aynı zamanda düşük seviyeli hafıza manipülasyonu için olanaklar sunar. Dil hem düşük seviye hem de yüksek seviye dillerin özelliğini kullandığından, orta seviye dil olarak kabul edilir

C 
C , 70'li yıllarda geliştirilen ve C ++ diline benzeyen bir başka genel amaçlı ve zorunlu programlama dilidir. Bu dilin, C ++, Python, Java ve diğerleri gibi diğer diller için yapı elemanları sunan en yaygın kullanılan programlama platformu olduğu bilinmektedir. Bu diller doğrudan veya dolaylı olarak özellikleri ödünç alır ve bunlardan bazıları kontrol yapılarını, genel sözdizimini ve standart kütüphaneleri içerir. Bu dilin desteklediği özelliklerden bazıları statik tip sistem, sözcüksel değişken kapsamı, özyineleme ve yapılandırılmış programlamadır.


2.2.2. Veri depolama

	Web uygulamalarında yaygın olarak veri depolamaları işlemleri veri tabanı aracılığı ile yapılmaktadır. Veri tabanı basit olarak bilgi depolayan bir yazılımdır. Birçok yazılım bilgi depolayabilir ama aradaki fark, veri tabanları bu bilgileri verimli ve hızlı bir şekilde yönetip değiştirebilmesidir. Bilgiye gerekli olduğu zaman ulaşabilmek esastır. Veri tabanı yönetim sistemleri büyük miktarlardaki verilerin güvenli bir şekilde tutulabildiği, bilgilere hızlı erişim imkânlarının sağlandığı, bilgilerin bütünlük içerisinde tutulabildiği ve birden fazla kullanıcıya aynı anda bilgiye erişim imkânının sağlandığı programlardır. 






Web uygulamalarında Yaygın kullanılan Veri tabanları 
Veritabanı kullanılacaksa öncelikle bir veritabanı sistemi seçilmelidir. Veritabanı seçilirken hız, maliyet, mimari ve kullanılacak platform değerlendirilmesi yapılmalıdır. Araştırmalar sonucunda web üzerinde yaygın kullanılan veritabanları şunlardır ;

PostgreSQL; SQL standartlarına uygun, açık kaynak kodlu ve ücretsiz, ilişkisel bir veritabanı yönetim sistemidir. Hemen hemen bütün Unix türevi işletim sistemlerinde ve NT çekirdekli Windows sistemlerde çalışır.

MSSQL; Microsoft firmasının oluşturduğu bir veritabanı türüdür. MSSQL Açık kaynak kodlu olmaması nedeniyle kullanıcılara maliyetli gelebilir. Windows sistemlerde çalışır.

MySQL; Veritabanlarını tanımlamak, yaratmak, kullanmak, değiştirmek ve veri tabanı sistemleri ile ilgili her türlü işletimsel gereksinimleri karşılamak için tasarlanmış sistem ve yazılımdır. İlişkisel veri tabanını çeşitli tablolar arasında organize edilmiş verilerden oluşan veri tabanı olarak açıklayabiliriz. Bu farklı tablolar arasındaki veriler, çeşitli anahtarlar vasıtası ile birbirlerine bağlanırlar. İlgili tablolarda, sütunlar arasında bir anahtar sütun yeralır. Bu anahtar sütun aracılığı ile birden çok tablo verileri birbiriyle bağlantı sağlayabilir ve herhangi bir sorgulamada birlikte görüntülenebilir. MySQL çifte lisanslı bir yazılımdır. Yani hem Genel Kamu Lisansı’na (GPL) sahip özgür bir yazılım, hem de GPL’in kısıtladığı alanlarda kullanmak isteyenler için ayrı bir lisansa sahiptir.








3. PROJE SÜREÇLERİ

3.1. Proje Gereksinimlerinin Belirlenmesi

	Proje gereksinimleri, sadece yazılımdan oluşmaktadır. Proje kapsamında kullanıcılara sunulacak içerikler belirlenmelidir. Bu içerikler;
    • Restful standartlarını öğrenerek buna uygun bir API desteği sunulmalı.
    • API uygulamalarında kullanılan Java Spring, Scala Akka http python django gibi dil desteği seçilmeli.
    • SQL veri depolama birimi kullanarak işlemlerin ve içeriklerin kaydını tutulmalı.
    • Dökümanların gerekli dillere çevirilebilmesi için Google translate, Amazon translate, Azure translate gibi çeviri yöntemlerinden birini kullanılmalı.
    • Unit ve interface testleri gerçekleştirilmeli. 














3.2. Projede Gerekli Alanların Belirlenmesi

    • Ajanda
        ◦ Özel günlerinin takibi
        ◦ Özel günlere özel mail tasarımlarının görüntülenmesi
    • Çeviri
        ◦ Mail içeriklerinin bir çok dilde çevrilebilmesi
        ◦ Mevcut çevirilerin listelenmesi
        ◦ Çevirilerin mail alanına aktarılabilmesi
    • Mail
        ◦ Mail gönderim sayfası
        ◦ Gönderilen maillerin listelenmesi


















3.3. Proje Temelinin Oluşturulması

Projenin oluşturulması kapsamında tasarım ve yönetim süreçleri altında temel olarak Model-View-Controller mimari deseni kullanılmıştır. MVC mimarisi, tüm platformlar üzerinde çalışabilmesi, web platformlarında yaygın kullanımı olması nedeniyle java dilinde spring framework ve thymeleaf ile oluşturulmuştur. Veri tabanı olarak, MySql veri tabanını kullanılmıştır. Veri tabanı tabloları ile modeller ilişkilendirilerek veri depolama ve kullanım işlemleri soyutlaştırılmıştır. View kullanıcı arayüzü HTML, CSS ve Bootstrap  kullanılmıştır.. Controller, kullanıcılardan gelen istekleri belirleyerek model bileşenlerindeki gerekli verileri view içerisine aktararak kullanıcılara sunmaktadır.
 
Şekil 3.1.1 Class Diagram: Spring framework ile MVC temelinin uygulanması









3.4. Proje Arayüz Tasarım Planı

İşlerin sistematik olarak yürütülmesinin istendiği her çalışmanın bir proje analiz süreci vardır. Proje analiz sürecinde yapılacak işin net olarak belirlenmesi oldukça önemlidir. Tasarım sürecinde istenilen işlevlere sahip bir ürünün ortaya konulması için tasarım planı oluşturulması projenin kurgusu ve işlevselliği hakkında hem yazılımcıya hem de müşteriye fikir sahibi olma imkanı sağlayan proje ön hazırlık aşamasıdır. Proje hakkında düşündüklerinizin görsel taslağı niteliğindedir ve projenin özellikleri ve fonksiyonalitesi hakkında bilgi verir. Proje içeriğinin nasıl konumlandırılacağını, neyin ne kadar yer kaplayacağını aşağı yukarı ortaya koyacağı için planlamanın doğru oranlarla yapılmasını bizlere avantaj sağlar. Bu durumu göz önüne alarak belirlemiş olan tasarım planı;
 
Şekil 3.4.1 Proje tasarım planı


3.5. UML DİYAGRAMLARI
3.5.1. Use Case Diyagramı

Kullanıcıların ve yetkili personelin platform üzerinde kullanılacak alanları use case diagram kullanılarak belirlenmiştir.
   
Şekil 3.5.1.1 Use Case Diyagramı








3.5.2. Class Diyagramı

Bir dilin özellikleri çalışma şekli, cevap verme şekli, kodların ne kadar kolay anlaşılabilir ve yazılabilir olduğunu ve neler başarabileceğini tanımlar. Kullanılacak olan programlama dillerinin temel özellikleri araştırılması önem taşımaktadır. 

Şekil 3.5.2.1 Class Diyagramı















3.5.3. Veri Tabanı EER Diyagramı

Bir dilin özellikleri çalışma şekli, cevap verme şekli, kodların ne kadar kolay anlaşılabilir ve yazılabilir olduğunu ve neler başarabileceğini tanımlar. Kullanılacak olan programlama dillerinin temel özellikleri araştırılması önem taşımaktadır. 


Şekil 3.5.3.1 MySQL EER Diyagramı



















3.6. Sistem Kullanım Mimarisi

Kullanıcı programı başlattığında arayüz açılmaktadır. Kullanıcı saldırılar yapar ve program bu açıklıkları analiz edip ve raporlar. 

Şekil 3.6.1 Sistem Kullanım Mimarisi
3.7. VERİ TASARIMI

Web uygulamasında ülkelerin özel günleri, yapılan çeviriler, mail göndericek mail içerikleri ve tasarım içerikleri MySQL veri tabanında tutulmaktadır. Bu içerikler Şekil 3.5.3.1’te görüldüğü gibi sekiz tablodan oluşmaktadır. 

	3.7.1. Kullanılan Dil ve Yapılar

Proje, Linux işletim sisteminde Ubuntu 14.04 LTS ve Windosw 10 işletim sistemlerinde çalışabilecek şekilde tasarlanıp, gerçekleştirilmiştir. 
Arayüz için ise html sayfasında css ve javaScript dili kullanılmıştır. Verilerin arayüzlere aktarılması için MVC tarafından sağlanmıştır. Projenin veri tabanı mysql, docker kullanılarak oluşturulmuştur. Herhangi bir IDE kullanmadan, terminal ve localhost üzerinden proje çalışabilmektedir. 

Neler Kullanılmıştır?
    • HTML
    • Css,
    • JavaScript,
    • Spring framework
    • MySQL
    • Docker

Niçin Java Programlama Dili Kullanılmıştır?

    • Tüm platformlar üzerinde çalışabilmesi 
    • Web platformlarında yaygın kullanımı 
    • Spring framework ile web uygulamaları için kapsamlı bir programlama ve konfigürasyon altyapı desteği sunması 
    • Çalışmaların derlenerek daha güvenilir ve test edilebilir alt yapı desteği sunması
4. KURULUM, ÇALIŞTIRMA VE KODLAMA ADIMLARI

4.1. Linux işletim sistemi için kurulumlar

    • İntellij Kurulumu 

    • Docker Kurulumu

    • Docker ile Mysql Kurulumu


Proje oluşturulabilmesi için;
    • İntellij kurulumu
sudo add-apt-repository ppa:ubuntuhandbook1/apps
sudo apt-get update
sudo apt-get install intellij-idea-community

Linux işletim sisteminde terminal üzerinden bu komutları çalıştırdığınızda intellij IDE uygulaması otomatik olarak kurulacaktır.

Şekil 4.1.2.1  İntellij açılış ekranı






    • Docker kurulumu
        ◦ sudo apt-get install apt-transport-https ca-certificates curl software-properties-common
        ◦ curl -fsSL https://download.docker.com/linux/ubuntu/gpg | sudo apt-key add -
        ◦ sudo add-apt-repository "deb [arch=amd64] https://download.docker.com/linux/ubuntu $(lsb_release -cs) stable"
        ◦ sudo apt-get install docker-ce
        ◦ sudo systemctl status docker

Linux işletim sisteminde terminal üzerinden bu komutları çalıştırdığınızda Docker uygulaması otomatik olarak kurulacaktır.

Şekil 4.1.2.2  Docker çalışma sistemi








4.2. ÇALIŞMA ADIMLARI

4.2.1 Kullanılılan Altyapı
Proje için daha önceden yapmış olduğumuz araştırmalarımızın, kullanımlar için verdiğimiz kararların ve oluşturduğumuzun tasarımların neticesinde karar vermiş olduğumuz Programlama dili Java, Alt yapı mimarisi MVC ve Veri tabanı MySQL ile Şekil 3.1.1 üzerinde belirtmiş olduğumuz diagram ile projemizin temellerini oluşturulmuştur.  

4.3. Web Uygulamasının Spring Framework ile Çalıştırılması
Java web uygulaması, controllerda tanımlanmış olan url bilgisini sunucu üzerindeki bir sayfaya yönlendirir ve controller tarafından bir sayfa belirtilmemiş ise önceden tanımlı olan index.html vb. bir index dosyasını çalıştırır. 

















4.3. Kodlama Adımları

4.3.1 Başlangıç adımları
Java web Spring framework tarafından sağlanan MVC yapısı ile controller, model, view paketleri oluşturulmuştur. Spring framework tarafından tavsiye edilen güvenilir ve testleri tamamen tamamlanmış açık kaynak kodlu web uygulaması desteği sağlayan thymeleaf framework projeye eklenmiştir. Bu sayede spring framework tarafından sağlanan RestAPI endpointlerine ek olarak kullanıcının interaktif olarak etkileşime geçebileceği html arayüzleri de proje içerisine eklenmiştir.

	4.3.2. Controller
Controller görevlerini şu aşamada biliyor ve biliyor ki controller ve tüm methodlar bir url path bilgisi üzerinden çalıştırılıyor. Kullanıcılar tarafından istenilen ise bir arayüz ve bu arayüz HTML, CSS ve gerekli veriler bütünü ile oluşturulıdır. Oluşturulan bu içerikler ile kullanıcılar web tarayıcılarının tarayıcı motoru yardımı ile bir arayüz görebilecekler.  
Controller bir arayüz tasarımını ve gerekli dinamik verileri bir araya getirerek kullanıca göndermektedir. Bu işlemler için Model sınıflarından gerekli verileri ve View üzerinden tasarımı alarak bunları kullanıcıya sunar.


Uygulama içerisindeki Kontrolörler;
        ◦ Page Controller
            ▪ Kullanıcılara bir arayüz üzerinden etkileşime geçebilecekleri web sayfalarının sunulmasını PageController tarafından sağlanır.
            ▪ /  Anasayfa index.html sunulmaktadır.
            ▪ /translate çeviri sayfası sunulmaktadır.
            ▪ /email mail gönderim sayfası sunulmaktadır
            ▪ /mailbox gönderilmiş mail listesi sunulmaktadır. 






        ◦ TranslateController
            ▪ Kullanıcılar tarafından Rest standartları ile mail içeriklerinin çevirilebilmesi sağlamaktadır.
                • GET /api/translations 
                    ◦ Bu endpoint üzerinden tüm çeviriler sunulmaktadır.
                • POST  /api/translations 
                    ◦ Bu endpoint üzerinden translation işlemi gerçekleştirilir.
        ◦ MailController
                • GET /api/emails 
                    ◦ Bu endpoint üzerinden tüm mail verileri sunulmaktadır.
                • POST  /api/emails 
Bu endpoint üzerinden mail gönderme işlemi gerçekleştirilmektedir.











4.3.3. Veritabanı bağlantıları ve modelleme 
Model sınıfları için MVC mimarisine uygun bir ata (BaseController) sınıfında ihtiyaç olan tüm servisler belirlenerek uygulamanın ihtiyaç duyduğu tüm veriler bu servisler üzerinden veritabanı bağlantısı gerçekletirerek bilgileri ve tüm ortak sql sorgularını Hybernate kütüphanesi ile güvenli bir şekilde çalıştıran repository sınıfları oluşturulmuştur. Böylece projenin veriler ile ilgili tüm işlemleri bu sınıflar üzerinden gerçekleştirecek veri tabanı işlemlerini sarmalamış hale getirerek diğer tüm sınıfların veri işlemlerini veritabanından bağımsız halde bu sınıf üzerinden gerçekleştirilebilmesi sağlanacaktır.

Uygulama içerisinde Veritabanı tablolarının sınıflandırılması ve methodlaştırılmasını sağlayan modeller;
        ◦ Translation
        ◦ Mail


















4.3.4. View – Sayfa kodlama ve tasarımlama
	Sayfa verilerinin ayrıştırılması için çekirdek bir layout tasarımı oluşturulmuştur. Bu tasarım belirtilen tüm sayfalarda ortak olarak kullanılan alanrı birleştirerek kullanıcılara sunmaktadır.
Sayfa tasarımları için ortak alanları ayrıştırılmıştır.
            ▪ Header
            ▪ Content
                • Content içerisine oluşturulmuş olan farklı sayfa tasarımları eklenmektedir.
            ▪ Footer

View oluşturulurken öncelik olarak Şekil 3.4.1 gibi tasarım oluşturduğundan ve bu taslaklara uygun tasarımlar oluşturmak tasarım sürecini oldukça hızlandırmaktadır. Ayrıca bu tasarımların ayrıştırılarak oluşturulması tasarım tekrarlarını engellemektedir. Yukarıda belirtmiş olduğum Proje süreçleri tek bir defa tasarlanmış olup controller tarafından belirtilen miktarda anasayfa ve çeviri  ve mail sayfalarında kullanılmıştır.  












5. ARAYÜZLER
Anasayfa Tasarımı
 
Şekil 5.1.1.  Anasayfa Tasarımı


 
Şekil 5.2.1.  Örnek Mail Tasarımları
Çeviri Sayfası Tasarımı
 
Şekil 5.3.1.  Çeviri Sayfa Tasarımı
Mail Sayfası Tasarımı
 
Şekil 5.4.1.  Mail Sayfası Tasarımı




Gönderilen Mailler Sayfası Tasarımı
 
Şekil 5.5.1.  Gönderilen Mailler Sayfası Tasarımı 

















6. SONUÇ VE ÖNERİLER


Bu rapor, 2019-2020 Öğretim yılı Bitirme Projeleri kapsamında, E-ticaret pazarlama yönetim sistemlerinde çok dilli çok uluslu yapılar web yönetimi projesi hakkında kullanıcıyı bilgilendirme amacıyla hazırlanmıştır. Projede, verilen bir web uygulaması ve bu uygulamanın bağlantılı olduğu içerikler sonucunda, veri sızdırma gibi güvenlik açıklıkların önüne, maksimum düzeyde geçilebileceği bir yazılım geliştirilmiştir.

Yapılan bu çalışma sonucunda istenilen içeriklerin ve yönetimlerin yerine getirilmiştir. 

Yapılmış olan web uygulaması, Uluslararası e-ticaret sektöründe kullanılabilmesi amacı ile tasarlanmıştır ve sunulmuştur.
 
KAYNAKLAR

[1] Tr.wikipedia.org Model-View-Controller. [online] Available at: https://tr.wikipedia.org/wiki/Model-View-Controller [Accessed 1 Oct. 2019].
[2] Cleverism. (2017). Top Programming Languages used in Web Development. [online] Available at: https://www.cleverism.com/programming-languages-web-development/ [Accessed 15 Oct. 2019].
[3] En.wikipedia.org. Representational state transfer. [online] Available at: https://en.wikipedia.org/wiki/Representational_state_transfer [Accessed 17 Oct. 2019].
[4] Wpbeginner.com. (2015). [online] Available at: https://www.wpbeginner.com/glossary/apache/ [Accessed 18 Oct. 2019].
[5] www.tutorialspoint.com. (n.d.). Java Tutorial. [online] Available at: https://www.tutorialspoint.com/java/ . 
[6] CURL(Client URL Library Functions) Nedir? CURL ile kullanıcı kontrolü nasıl yapılır?, http://www.uguryildiz.net/curlclient-url-library-functions-nedir-curl-ile-kullanici-kontrolu-nasil-yapilir/
[7] Spring Framework (2018). Spring framework kullanımı. [online] Available at: https://spring.io/projects/spring-framework. [Accessed 30 Oct. 2019].


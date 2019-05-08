Kết quả Quality Testing sử dụng công cụ kiểm thử để test trang hoclieu.vn

Security testing by VEGA : 

Cài đặt : Tải bản phù hợp trên : https://subgraph.com/vega/download/ rồi chạy file setup

Kết quả sau khi test :

Cảnh báo : Possible Source Code Disclosure 

Thuộc phần : information 

Resourse : /scripts.3f3c9b627f96d58843ec.js

Độ nguy hiểm : Medium 

Nội dung phần gây ra : <%([\s\S]+?)(?:%>

Nguyên nhân + Hậu quả : VEGA tìm thấy 1 đoạn của text trùng với đặc điểm của phần mã nguồn . Điều này dẫn đến việc những kẻ tấn công có thể dễ dàng hơn trong việc tìm hiểu tính chất của phần mềm , cũng như cấu trúc và các thành phần của bên thứ ba . Đôi khi , các thông tin nhạy cảm có thể bị bao gồm trong mã nguồn 

Cách sửa chữa : Nếu chắc chắn đây là đoạn mã liên quan đến chương trình thì nên tìm rõ rồi xóa bỏ hoặc ngăn chặn đoạn mã gây cảnh báo trở thành 1 kết quả đầu ra . 

Performance testing by WAPT : 

Cài đặt : Tải phiên bản phù hợp trên : https://www.loadtestingtool.com/evaluation-made-easy.shtml và chạy file setup 

Kết quả sau khi test :

Trang hoclieu.vn chạy 1 cách ổn định và không có cảnh báo về trọng tải nào 

Asscessibility testing by Achecker : 

Cài đặt : truy cập https://achecker.ca/checker/index.php để sử dụng 

Kết quả sau khi test : 

Có 1 lỗi đã được nhân biết :

1.4 Distinguishable: Make it easier for users to see and hear content including separating foreground from background.

Success Criteria 1.4.4 Resize text (AA)

Check 117: i (italic) element used.

Repair: Replace your i elements with em or strong.

Error Line 33, Column 7:

<i class="fa fa-spinner fa-5x fa-spin text-blue-custom"></i>

Có 22 lỗi có thể xảy ra :

1.3 Adaptable: Create content that can be presented in different ways (for example simpler layout) without losing information or structure.

Success Criteria 1.3.1 Info and Relationships (A)

Check 270: Unicode right-to-left marks or left-to-right marks may be required.

Manual Check Required Line 29, Column 1:

<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

Check 271: dir attribute may be required to identify changes in text direction.

Manual Check Required Line 29, Column 1:

<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

1.4 Distinguishable: Make it easier for users to see and hear content including separating foreground from background.

Success Criteria 1.4.1 Use of Color (A)

Check 86: script may use color alone.

Manual Check Required Line 12, Column 3:

<script>
    (function(i, s, o, g, r, a, m) {

      i['GoogleAnalyticsObject'] = r;

      i[r] = i[r ...

Manual Check Required Line 38, Column 1:

<script type="text/javascript" src="runtime.e3b9dd07fbf356c5c4c5.js"></script>

Manual Check Required Line 38, Column 93:

<script type="text/javascript" src="polyfills.f0726e87068e99e4febd.js"></script>

Manual Check Required Line 38, Column 187:

<script type="text/javascript" src="scripts.76d9fc28e26b6a823613.js"></script>

Manual Check Required Line 38, Column 279:

<script type="text/javascript" src="main.ae123b3fdb6caccf5b25.js"></script>

2.1 Keyboard Accessible: Make all functionality available from a keyboard.

Success Criteria 2.1.1 Keyboard (A)

Check 89: script user interface may not be accessible.

Manual Check Required Line 12, Column 3:

<script>

    (function(i, s, o, g, r, a, m) {

      i['GoogleAnalyticsObject'] = r;

      i[r] = i[r ...

Manual Check Required Line 38, Column 1:

<script type="text/javascript" src="runtime.e3b9dd07fbf356c5c4c5.js"></script>

Manual Check Required Line 38, Column 93:

<script type="text/javascript" src="polyfills.f0726e87068e99e4febd.js"></script>

Manual Check Required Line 38, Column 187:

<script type="text/javascript" src="scripts.76d9fc28e26b6a823613.js"></script>

Manual Check Required Line 38, Column 279:

<script type="text/javascript" src="main.ae123b3fdb6caccf5b25.js"></script>

2.3 Seizures: Do not design content in a way that is known to cause seizures.

Success Criteria 2.3.1 Three Flashes or Below Threshold (A)

Check 87: script may cause screen flicker.

Manual Check Required Line 12, Column 3:

<script>

    (function(i, s, o, g, r, a, m) {

      i['GoogleAnalyticsObject'] = r;

      i[r] = i[r ...
Manual Check Required Line 38, Column 1:

<script type="text/javascript" src="runtime.e3b9dd07fbf356c5c4c5.js"></script>

Manual Check Required Line 38, Column 93:

<script type="text/javascript" src="polyfills.f0726e87068e99e4febd.js"></script>

Manual Check Required Line 38, Column 187:

<script type="text/javascript" src="scripts.76d9fc28e26b6a823613.js"></script>

Manual Check Required Line 38, Column 279:

<script type="text/javascript" src="main.ae123b3fdb6caccf5b25.js"></script>

2.4 Navigable: Provide ways to help users navigate, find content, and determine where they are.

Success Criteria 2.4.1 Bypass Blocks (A)

Check 28: Document may be missing a "skip to content" link.

Manual Check Required Line 29, Column 1:
<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

Check 262: Groups of links with a related purpose are not marked.

Manual Check Required Line 29, Column 1:

<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

Success Criteria 2.4.2 Page Titled (A)

Check 54: title might not describe the document.

Manual Check Required Line 5, Column 3:

<title>Học liệu</title>

Success Criteria 2.4.5 Multiple Ways (AA)

Check 184: Site missing site map.

Manual Check Required Line 29, Column 1:

<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

3.2 Predictable: Make Web pages appear and operate in predictable ways.

Success Criteria 3.2.3 Consistent Navigation (AA)

Check 276: Repeated components may not appear in the same relative order each time they appear.

Manual Check Required Line 29, Column 1:

<body>

  <app-root>

    <div style="width: 100%;padding-top:30vh;text-align: center;">

      <i cla ...

Link Video : 

https://drive.google.com/file/d/11nJt6f0MYWvDkkRsoDDag-2ezJ1AbaaG/view?usp=sharing

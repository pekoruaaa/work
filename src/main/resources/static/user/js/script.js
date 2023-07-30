///////////////////////////////////////////////////////////
// Make mobile navigation work

const btnNavEl = document.querySelector(".btn-mobile-nav");
const headerEl = document.querySelector(".header");

btnNavEl.addEventListener("click", function () {
  headerEl.classList.toggle("nav-open");
});

///////////////////////////////////////////////////////////
// Smooth scrolling animation

const allLinks = document.querySelectorAll("a:link");

allLinks.forEach(function (link) {
  link.addEventListener("click", function (e) {
    e.preventDefault();
    const href = link.getAttribute("href");

    // Scroll back to top
    if (href === "#")
      window.scrollTo({
        top: 0,
        behavior: "smooth",
      });

    // Scroll to other links
    if (href !== "#" && href.startsWith("#")) {
      const sectionEl = document.querySelector(href);
      sectionEl.scrollIntoView({ behavior: "smooth" });
    }

    // Close mobile naviagtion
    if (link.classList.contains("main-nav-link"))
      headerEl.classList.toggle("nav-open");
  });
});

///////////////////////////////////////////////////////////
// Sticky navigation

const sectionHeroEl = document.querySelector(".section-hero");

const obs = new IntersectionObserver(
  function (entries) {
    const ent = entries[0];
    console.log(ent);

    if (ent.isIntersecting === false) {
      document.body.classList.add("sticky");
    }

    if (ent.isIntersecting === true) {
      document.body.classList.remove("sticky");
    }
  },
  {
    // In the viewport
    root: null,
    threshold: 0,
    rootMargin: "-80px",
  }
);
obs.observe(sectionHeroEl);

///////////////////////////////////////////////////////////
// Fixing flexbox gap property missing in some Safari versions
function checkFlexGap() {
  var flex = document.createElement("div");
  flex.style.display = "flex";
  flex.style.flexDirection = "column";
  flex.style.rowGap = "1px";

  flex.appendChild(document.createElement("div"));
  flex.appendChild(document.createElement("div"));

  document.body.appendChild(flex);
  var isSupported = flex.scrollHeight === 1;
  flex.parentNode.removeChild(flex);
  console.log(isSupported);

  if (!isSupported) document.body.classList.add("no-flexbox-gap");
}
checkFlexGap();

///////////////////////////////////////////////////////////
//轮播图
let slideIndex = 1;
let slideInterval;

showSlides(slideIndex);
autoPlaySlides();

function changeSlide(n) {
  clearInterval(slideInterval);
  showSlides((slideIndex += n));
  autoPlaySlides();
}

function autoPlaySlides() {
  slideInterval = setInterval(() => {
    showSlides((slideIndex += 1));
  }, 3000); // 3秒自动播放一次
}

function showSlides(n) {
  const slides = document.getElementsByClassName("slide");
  if (n > slides.length) {
    slideIndex = 1;
  }
  if (n < 1) {
    slideIndex = slides.length;
  }
  for (let i = 0; i < slides.length; i++) {
    slides[i].style.display = "none";
  }
  slides[slideIndex - 1].style.display = "block";
}

// // 注册界面 验证码
// function sendSMS() {
//   const button = document.getElementById("send_sms_code");
//   button.innerHTML = "发送中...";
//   button.classList.add("sending"); // 添加发送中样式
//   button.disabled = true; // 禁用按钮点击
// }
// function sendSMS() {
//   const button = document.getElementById("send_sms_code");
//   let countDown = 5; // 倒计时秒数
//   button.disabled = true; // 禁用按钮点击
//   const interval = setInterval(() => {
//     if (countDown > 0) {
//       button.innerHTML = `发送中 (${countDown}秒)`;
//       countDown--;
//     } else {
//       button.innerHTML = "获取验证码";
//       button.disabled = false; // 启用按钮点击
//       clearInterval(interval); // 清除定时器
//     }
//   }, 1000); // 每隔1秒更新一次按钮文本
// }

// 下拉菜单
function toggleDropdown() {
  var dropdownContent = document.getElementById("myDropdown");
  if (dropdownContent.style.display === "block") {
    dropdownContent.style.display = "none";
  } else {
    dropdownContent.style.display = "block";
  }
}

// 点击其他地方隐藏下拉菜单
window.onclick = function (event) {
  if (!event.target.matches(".dropbtn")) {
    var dropdowns = document.getElementsByClassName("dropdown-content");
    for (var i = 0; i < dropdowns.length; i++) {
      var openDropdown = dropdowns[i];
      if (openDropdown.style.display === "block") {
        openDropdown.style.display = "none";
      }
    }
  }
};

// 页面跳转
function redirectToPage() {
  window.location.href = "1.html";
}

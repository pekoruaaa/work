
// 模拟已有的点赞数和点赞状态（是否已点赞）
let likeCount = 0;
let isLiked = false;

// 获取点赞按钮和点赞数显示元素
const likeButton = document.getElementById('likeButton');
const likeCountElement = document.getElementById('likeCount');

// 初始化显示点赞数
likeCountElement.textContent = likeCount;

// 监听点赞按钮的点击事件
likeButton.addEventListener('click', function () {
    if (!isLiked) {
        likeCount++; // 点赞数加1
    } else {
        likeCount--; // 取消点赞，点赞数减1
    }

    isLiked = !isLiked; // 切换点赞状态

    // 更新点赞数显示
    likeCountElement.textContent = likeCount;
});

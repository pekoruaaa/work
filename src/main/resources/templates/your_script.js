// 获取评论列表容器和表单元素
const commentsContainer = document.getElementById('comments');
const commentForm = document.getElementById('commentForm');
const commentInput = document.getElementById('comment');

// 监听表单的提交事件
commentForm.addEventListener('submit', function (event) {
    event.preventDefault(); // 阻止表单默认提交行为

    // 获取输入的评论内容
    const comment = commentInput.value;

    // 创建新的评论元素
    const newCommentElement = document.createElement('div');
    newCommentElement.className = 'comment';
    // 不再包含姓名信息
    newCommentElement.innerHTML = `${comment}`;

    // 将新评论插入到评论列表的开头
    commentsContainer.prepend(newCommentElement);

    // 清空输入框内容
    commentInput.value = '';
});

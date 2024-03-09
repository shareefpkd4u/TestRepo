// Simulated blog post data
const blogPosts = [
    { title: 'First Post', content: 'This is my first blog post.' },
    { title: 'Second Post', content: 'This is my second blog post.' }
];

// Load blog posts dynamically
const blogPostsContainer = document.getElementById('blogPosts');
blogPosts.forEach((post) => {
    const postElement = document.createElement('div');
    postElement.classList.add('blogPost');
    postElement.innerHTML = `
        <h2>${post.title}</h2>
        <p>${post.content}</p>
    `;
    blogPostsContainer.appendChild(postElement);
});

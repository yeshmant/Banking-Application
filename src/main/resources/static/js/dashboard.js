// dashboard.js

document.addEventListener("DOMContentLoaded", function () {
    console.log("Dashboard JS loaded successfully!");
});


// Inline Script for toggle
function toggleTransactions() {
    const extraRows = document.querySelectorAll('.txn-extra');
    extraRows.forEach(row => row.classList.toggle('hidden'));
    const btn = document.querySelector('.transaction-buttons button');
    if (btn.innerText === "See More") {
        btn.innerText = "See Less";
    } else {
        btn.innerText = "See More";
    }
}
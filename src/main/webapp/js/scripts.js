/**
 * 
 */
document.getElementById("filter-btn").addEventListener("click", function () {
    const subject = document.getElementById("subject").value;
    const condition = document.querySelector('input[name="condition"]:checked').value;
    const value1 = document.getElementById("filter-value-1").value;
    const value2 = document.getElementById("filter-value-2").value;

    const rows = document.querySelectorAll("tbody tr");
    rows.forEach(row => {
        const score = parseInt(row.querySelector(`td:nth-child(${subjectIndex(subject)})`).innerText);
        let match = false;

        if (condition === "Above") match = score > value1;
        else if (condition === "Below") match = score < value1;
        else if (condition === "Between") match = score >= value1 && score <= value2;

        row.style.display = match ? "" : "none";
    });
});

function subjectIndex(subject) {
    switch (subject) {
        case "English": return 3;
        case "Maths": return 4;
        case "Science": return 5;
        case "SocialScience": return 6;
    }
}

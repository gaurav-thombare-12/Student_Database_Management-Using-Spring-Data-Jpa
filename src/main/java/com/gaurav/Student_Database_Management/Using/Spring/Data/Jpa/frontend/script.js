document.addEventListener("DOMContentLoaded", function () {
    fetchStudents();
});

function fetchStudents() {
    fetch("http://localhost:8080/api/sdm/all")
        .then(response => response.json())
        .then(data => {
            let tableBody = document.getElementById("studentTableBody");
            tableBody.innerHTML = ""; // Clear existing data

            data.forEach(student => {
                let row = `<tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.email}</td>
                    <td>${student.course}</td>
                    <td>${student.age}</td>
                </tr>`;
                tableBody.innerHTML += row;
            });
        })
        .catch(error => console.error("Error fetching student data:", error));
}

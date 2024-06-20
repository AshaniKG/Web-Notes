const editButton = document.querySelector('.EditButton');
const deleteButton = document.querySelector('.DeleteButton');
const saveButton = document.querySelector('.SaveButton');
const noteContent = document.getElementById('noteContent');

// Event Listener for Edit Button
editButton.addEventListener('click', () => {
    noteContent.disabled = false; // Enable editing the content
    editButton.style.display = 'none'; // Hide the Edit button
    saveButton.style.display = 'flex'; // Show the Save button
});

// Event Listener for Delete Button (Handle this with AJAX or redirect to a delete controller)
deleteButton.addEventListener('click', () => {
    // You'll need to use AJAX to send a delete request to a server-side controller
    // Example using fetch API (replace with your server-side endpoint)
    if (confirm("Are you sure you want to delete this note?")) {
        fetch('/WebNotes/NoteDelete?noteId=' + noteId, {
            method: 'POST'
        })
        .then(response => {
            if (response.ok) {
                window.location.href = '/WebNotes/YourNotes'; // Redirect to the notes list
            } else {
                // Handle error
            }
        })
        .catch(error => {
            // Handle error
        });
    }
});

// Event Listener for Save Button (Handle this with AJAX or redirect to an update controller)
saveButton.addEventListener('click', () => {
    const updatedTitle = noteTitle.value;  // Get title from input
    const updatedDate = noteDate.value;  // Get date from input
    const updatedContent = noteContent.value;
    fetch('/WebNotes/UpdateNote?noteId=' + noteId, {
        method: 'POST',
        body: JSON.stringify({ 
            title: updatedTitle, 
            date: updatedDate, 
            content: updatedContent 
        })  // Send the updated content
    })
    .then(response => {
        if (response.ok) {
            window.location.href = '/WebNotes/YourNotes'; // Redirect to the notes list
        } else {
            // Handle error
        }
    })
    .catch(error => {
        // Handle error
    });
});
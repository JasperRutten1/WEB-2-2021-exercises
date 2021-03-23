<header>
    <h1>Studenten</h1>
    <nav>
        <ul>
            <li>
                <a ${param.actual eq 'home' ? 'id="actual"' : ""} href="StudentInfo?command=home">Home</a>
            </li>
            <li>
                <a ${param.actual eq 'voegtoe' ? 'id="actual"' : ""} href="studentform.jsp">Toevoegen</a>
            </li>
            <li>
                <a ${param.actual eq 'overzicht' ? 'id="actual"' : ""} href="StudentInfo?command=listStudents">Overzicht</a>
            </li>
            <li>
                <a ${param.actual eq 'zoek' ? 'id="actual"' : ""} href="zoek.jsp">Zoek</a>
            </li>
        </ul>
    </nav>
</header>

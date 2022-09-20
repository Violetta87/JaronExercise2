getSpaceListe();

async function getSpaceListe(){

    const url_list = 'https://api.spacexdata.com/v2/launches';
    const response = await fetch(url_list);
    const data = await response.json();

    const spaceList = Array.from(data);

    console.log(spaceList);

    let table1 = document.getElementById("table1");

    table1.innerHTML += ` <tr>
    <th>Flight number</th>
    <th>Mission name</th>
    <th>Mission id</th>
    <th>Upcoming</th>
    <th>launch year</th>
    <th>launch date unix</th>
    <th>launch date utc</th>
    <th>launch date local</th>
    <th>is tentative ok</th>
    <th>tentative max precision</th>¨
    <th>tbd</th>
    <th>launch window</th>
    <th>rocket</th>
</tr>`;



    for(let i = 0; i< spaceList.length; i++){
        table1.innerHTML += "<tr>" +

            "<td>" + spaceList[i] + "</td>" +
            "<td>" + spaceList[i].flight_number + "</td>" +


            "</tr>"



    }
}
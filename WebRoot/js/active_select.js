$(function(){
    $.ajax({
        type:"post",
        url:"./logisticDynamic/getAll.action",
        dataType:"json"
    }).success(function(res){
        var $tbody = $('.table tbody').eq(0),
            fragment = document.createDocumentFragment(),
            i = 0,
            len = res.length;
        for( ; i<len ; i++){
            var tr = document.createElement('tr'),
                opTd = document.createElement('td');

            for(var j in res[i]){
                var td = document.createElement('td');
                td.innerHTML = res[i][j];
                tr.appendChild(td);
            }

            opTd.innerHTML = '<a href="javascript:">详细</a>';
            tr.appendChild(opTd);
            fragment.appendChild(tr);
        }
        $tbody.append(fragment);
    })
})
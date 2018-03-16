/**
 * Created by orange on 2017-04-25.
 */

$(function () {
    $('#table').bootstrapTable({
        url: '/getBoard',
        columns: [{
            field: 'boardId',
            title: 'Item ID'
        }, {
            field: 'boardName',
            title: 'Item Name'
        }, {
            field: 'boardPeopleNumber',
            title: 'Item Price'
        }, {
            field: 'boardType',
            title: 'Item Type'

        }]
    });
});
<template>

    <v-data-table
        :headers="headers"
        :items="orderMypage"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'OrderMypageView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
                { text: "cookinfo", value: "cookinfo" },
                { text: "status", value: "status" },
            ],
            orderMypage : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/orderMypages'))

            temp.data._embedded.orderMypages.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.orderMypage = temp.data._embedded.orderMypages;
        },
        methods: {
        }
    }
</script>


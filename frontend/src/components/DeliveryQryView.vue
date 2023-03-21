<template>

    <v-data-table
        :headers="headers"
        :items="deliveryQry"
        :items-per-page="5"
        class="elevation-1"
    ></v-data-table>

</template>

<script>
    const axios = require('axios').default;

    export default {
        name: 'DeliveryQryView',
        props: {
            value: Object,
            editMode: Boolean,
            isNew: Boolean
        },
        data: () => ({
            headers: [
                { text: "id", value: "id" },
            ],
            deliveryQry : [],
        }),
          async created() {
            var temp = await axios.get(axios.fixUrl('/deliveryQries'))

            temp.data._embedded.deliveryQries.map(obj => obj.id=obj._links.self.href.split("/")[obj._links.self.href.split("/").length - 1])

            this.deliveryQry = temp.data._embedded.deliveryQries;
        },
        methods: {
        }
    }
</script>


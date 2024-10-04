<template>
  <div id="app">
    <h1>Vue 드래그 앤 드롭 리스트</h1>
    <div class="list-container">
      <div
        v-for="(item, index) in items"
        :key="item.id"
        class="list-item"
        draggable="true"
        @dragstart="dragStart(index)"
        @dragover.prevent
        @drop="drop(index)"
      >
        {{ item.text }}
      </div>
    </div>
  </div>
</template>

<script>
export default {
  data() {
    return {
      items: [
        { id: 1, text: "아이템 1" },
        { id: 2, text: "아이템 2" },
        { id: 3, text: "아이템 3" },
      ],
      draggedItem: null,
    };
  },
  methods: {
    dragStart(index) {
      this.draggedItem = this.items[index];
    },
    drop(index) {
      const draggedIndex = this.items.indexOf(this.draggedItem);
      this.items.splice(draggedIndex, 1);
      this.items.splice(index, 0, this.draggedItem);
      this.draggedItem = null;
    },
  },
};
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  text-align: center;
  margin-top: 40px;
}

.list-container {
  display: flex;
  flex-direction: column;
  align-items: center;
}

.list-item {
  width: 200px;
  padding: 10px;
  margin: 5px;
  background-color: #f0f0f0;
  border: 1px solid #ccc;
  cursor: move;
}
</style>

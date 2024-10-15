<!-- // '../node_modules/@fullcalendar/vue3' -->

<template>
  <div id="calendar"></div>
</template>

<script>
import Calendar from 'tui-calendar';
import 'tui-calendar/dist/tui-calendar.css';

export default {
  mounted() {
    const calendar = new Calendar('#calendar', {
      defaultView: 'month',
    });

    calendar.createSchedules([
      {
        id: '1',
        calendarId: '1',
        title: 'Vue.js 미팅',
        category: 'time',
        start: '2024-10-20T10:30:00',
        end: '2024-10-20T12:30:00',
      },
    ]);
  },
};
</script>

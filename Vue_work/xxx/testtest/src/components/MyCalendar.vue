<template>
    <div>
      <FullCalendar
        :events="calendarEvents"
        :plugins="calendarPlugins"
        initial-view="dayGridMonth"
        @dateClick="handleDateClick"
      />
    </div>
  </template>
  
  <script>
  import FullCalendar from '@fullcalendar/vue3'
  import dayGridPlugin from '@fullcalendar/daygrid'
  import interactionPlugin from '@fullcalendar/interaction'
  
  export default {
    components: {
      FullCalendar,
    },
    data() {
      return {
        // 일정 데이터
        calendarEvents: [
          { title: '회의', start: '2024-10-20' },
          { title: '프로젝트 마감', start: '2024-10-25' },
        ],
        // 사용할 플러그인들
        calendarPlugins: [dayGridPlugin, interactionPlugin],
      }
    },
    methods: {
      handleDateClick(info) {
        alert('날짜 클릭됨: ' + info.dateStr);
      }
    }
  }
  </script>
  
  <style scoped>
  /* FullCalendar 스타일 */
  .fc {
    max-width: 900px;
    margin: 0 auto;
  }
  </style>
  